package com.company.controller;

import com.company.model.entities.Car;
import com.company.model.repositories.ISearchRepository;

import java.util.ArrayList;

public class SearchController {

    private final ISearchRepository repo;

    public SearchController(ISearchRepository repo) {
        this.repo = repo;
    }

    public ArrayList<Car> getAllCars(){
        return repo.getAllCars();
    }

    public ArrayList < Car > getCarsBySearch(Car search){
        return repo.getCarsBySearch(search);
    }
}
