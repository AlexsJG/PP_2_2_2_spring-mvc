package web.service;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDAO;


    public CarServiceImpl(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(String count) {
        List<Car> allCars = carDAO.fillCarList();
        if (count == null) {
            return allCars;
        } else {
            int count1 = Integer.parseInt(count);
            if ((0 < count1) & (count1 < 5)) {
                List<Car> someCar = new ArrayList<>();
                for (int i = 0; i < count1; i++) {
                    someCar.add(allCars.get(count1));
                }
                return someCar;
            } else {
                return allCars;
            }
        }
    }
}