package com.mavim.carapi.repository;

import com.mavim.carapi.exception.NotFoundException;
import com.mavim.carapi.model.Car;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CarRepository {
    private static final AtomicLong idCounter = new AtomicLong(1);
    static Map<Long, Car> carsMap = new HashMap<>();

    public List<Car> findAll() {
        return new ArrayList<>(carsMap.values());
    }

    public Car findById(Long id) throws NotFoundException {
        return Optional.ofNullable(carsMap.get(id))
                .orElseThrow(NotFoundException::new);
    }

    public Car save(Car car) {
        car.setId(idCounter.getAndIncrement());
        carsMap.put(car.getId(), car);
        return car;
    }

    public Car delete(Long id) throws NotFoundException {
        return Optional.ofNullable(carsMap.remove(id))
                .orElseThrow(NotFoundException::new);
    }

    public Car update(Car car) throws NotFoundException {
        Optional.ofNullable(carsMap.get(car.getId()))
                .orElseThrow(NotFoundException::new);
        carsMap.put(car.getId(), car);
        return car;
    }
}
