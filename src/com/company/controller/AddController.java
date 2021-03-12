package com.company.controller;

import com.company.model.entities.Car;
import com.company.model.repositories.IAddRepository;

public class AddController {
    private final IAddRepository repo;

    public AddController(IAddRepository repo) {
        this.repo = repo;
    }

    public void addCar(Car newCar){
        repo.addCar(newCar);
    }
}
