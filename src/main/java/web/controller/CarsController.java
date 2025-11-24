package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.UserService.UserService;



@Controller
@RequestMapping("/cars")
public class CarsController {

    private final UserService userServiceImpl;

    @Autowired
    public CarsController(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }


    @GetMapping
    public String printSomeCar(@RequestParam(required = false) String count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", userServiceImpl.getCars(0));
        } else {
            model.addAttribute("cars", userServiceImpl.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}