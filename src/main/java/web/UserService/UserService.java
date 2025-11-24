package web.UserService;

import web.models.Car;

import java.util.List;

public interface UserService {

    List<Car> getCars(int count);
}
