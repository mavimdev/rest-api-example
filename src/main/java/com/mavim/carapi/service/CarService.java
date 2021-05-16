package com.mavim.carapi.service;

import com.mavim.carapi.exception.NotFoundException;
import com.mavim.carapi.model.Car;
import com.mavim.carapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    final private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(Long id) throws NotFoundException {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car delete(Long id) throws NotFoundException {
        return carRepository.delete(id);
    }

    public Car update(Car car) throws NotFoundException {
        return carRepository.update(car);
    }
}
