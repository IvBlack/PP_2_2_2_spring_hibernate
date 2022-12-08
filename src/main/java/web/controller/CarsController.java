package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    CarService service;

    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }

    //отдаем нужное кол-во авто в модель
    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(defaultValue = "5", value = "count") int amount) {
        model.addAttribute("carsArray", service.getCarsByCount(amount));
        return "cars";
    }
}

