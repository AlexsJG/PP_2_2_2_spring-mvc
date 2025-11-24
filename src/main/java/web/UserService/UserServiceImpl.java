package web.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carDAO.CarDAO;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final CarDAO carDAOimpl;

    @Autowired
    public UserServiceImpl(CarDAO carDAOimpl) {
        this.carDAOimpl = carDAOimpl;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> allCars = carDAOimpl.fillCarList();
        if ((0 < count) & (count < 5)) {
            List<Car> someCar = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                someCar.add(allCars.get(count));
            }
            return someCar;
        } else {
            return allCars;
        }
    }
}
