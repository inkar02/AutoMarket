package com.company.controller; //package

import com.company.model.entities.Car; //entity
import com.company.model.repositories.ISearchRepository;//Interface of SearchRepository

import java.util.ArrayList; //to use array

public class SearchController { //class to search the cars

    private final ISearchRepository repo;

    public SearchController(ISearchRepository repo) { //declare
        this.repo = repo;
    }

    public ArrayList<Car> getAllCars(){ //used to show the list of all cars
        return repo.getAllCars();
    }

    public ArrayList < Car > getCarsBySearch(Car search){ //array to search
        return repo.getCarsBySearch(search);
    }
}
