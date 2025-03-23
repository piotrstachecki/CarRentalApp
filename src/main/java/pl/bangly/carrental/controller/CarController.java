package pl.bangly.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bangly.carrental.entity.Car;
import pl.bangly.carrental.service.CarService;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService theCarService) {
        carService = theCarService;
    }

    @GetMapping("/list")
    public String listCars(Model theModel) {

        List<Car> theCars = carService.findAll();

        theModel.addAttribute("cars", theCars);

        return "cars/list-cars";
    }

    @GetMapping("/addCar")
    public String addCar(Model theModel) {

        Car theCar = new Car();

        theModel.addAttribute("car", theCar);

        return "cars/car-form";
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute("car") Car theCar) {
        carService.save(theCar);

        return "redirect:/cars/list";
    }

    @GetMapping("/updateCar")
    public String updateCar(@RequestParam("carId") int theId, Model theModel) {

        Car theCar = carService.findById(theId);

        theModel.addAttribute("car", theCar);

        return "cars/update-car";
    }

    @GetMapping("/deleteCar")
    public String deleteCar(@RequestParam("carId") int theId) {

        carService.deleteById(theId);

        return "redirect:/cars/list";
    }

    @GetMapping("/rentCar")
    public String rentCar(@RequestParam("carId") int theId, Model theModel) {

        Car theCar = carService.findById(theId);

        theModel.addAttribute("car", theCar);

        return "cars/rent-car";
    }
}
