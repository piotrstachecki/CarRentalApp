package pl.bangly.carrental.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bangly.carrental.dao.CarRepository;
import pl.bangly.carrental.entity.Car;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository theCarRepository) {
        carRepository = theCarRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAllByOrderByBrandAsc();
    }

    @Override
    public Car findById(int theId) {
        Optional<Car> result = carRepository.findById(theId);

        Car theCar = null;

        if(result.isPresent()){
            theCar = result.get();
        }
        else{
            throw new RuntimeException("Did not find car id - " + theId);
        }

        return theCar;
    }

    @Override
    public Car save(Car theCar) {
        return carRepository.save(theCar);
    }

    @Override
    public void deleteById(int theId) {
        carRepository.deleteById(theId);
    }
}
