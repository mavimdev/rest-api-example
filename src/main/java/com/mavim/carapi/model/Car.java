package com.mavim.carapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private Long id;
    private String brand;
    private String model;
    private String color;
    private String owner;
}
