package web.carDAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;


    @Override
    public List<Car> fillCarList() {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "Priora", 2001));
        carList.add(new Car("Lada", "Vesta", 2002));
        carList.add(new Car("Lada", "Niva", 2003));
        carList.add(new Car("Lada", "Granta", 2004));
        carList.add(new Car("Lada", "Largus", 2005));
        return carList;
    }
}
