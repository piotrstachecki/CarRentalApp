package pl.bangly.carrental.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bangly.carrental.entity.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    public List<Car> findAllByOrderByBrandAsc();
}
