package pl.bangly.carrental.service;

import pl.bangly.carrental.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car findById(int theId);

    Car save(Car theCar);

    void deleteById(int theId);
}
