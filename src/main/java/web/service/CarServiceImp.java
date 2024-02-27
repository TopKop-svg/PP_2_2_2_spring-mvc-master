package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
@Service
public class CarServiceImp implements CarService{
    private final List<Car> cars = Arrays.asList(
            new Car(1, "Toyota", 2005),
            new Car(2, "Lexus", 2014),
            new Car(3, "Honda", 2016),
            new Car(4, "Mazda", 2020),
            new Car(4, "Chevrolet", 2001)
    );

    public List<Car> getCars(int count) {
        if(count > 5) {
            return cars;
        }
        System.out.println(cars);
        return cars.subList(0, count);
    }
}
