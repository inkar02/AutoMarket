package com.company.controller;//package

import com.company.model.entities.Car;//entity
import com.company.model.repositories.IAddRepository;//repository

public class AddController { //Controller class for adding the new car
    private final IAddRepository repo;

    public AddController(IAddRepository repo) { //constructor
        this.repo = repo;
    }

    public void addCar(Car newCar){ //result function
        repo.addCar(newCar);
    }
}
