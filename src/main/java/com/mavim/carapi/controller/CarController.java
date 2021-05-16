package com.mavim.carapi.controller;

import com.mavim.carapi.exception.NotFoundException;
import com.mavim.carapi.model.Car;
import com.mavim.carapi.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car findById(@PathVariable Long id) throws NotFoundException {
        return carService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car update(@PathVariable( "id" ) Long id, @RequestBody Car car) throws NotFoundException {
        car.setId(id);
        return carService.update(car);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car delete(@PathVariable("id") Long id) throws NotFoundException {
        return carService.delete(id);
    }

}
