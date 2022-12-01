package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    List<Car> listOfCars;

    //массив авто
    public CarService() {
        listOfCars = Arrays.asList(
                new Car("BMW", 2019, "black"),
                new Car("Mercedez", 1965, "gold"),
                new Car("Tesla", 2020, "green"),
                new Car("Nissan", 2006, "blue"),
                new Car("Toyota", 2011, "yellow"));
    }

    //сервис фильтрации числа авто
    public List<Car> showCars(int amount) {
        if (amount < 5) {
        return listOfCars.subList(0, amount);
        } else { return listOfCars; }
    }
}
