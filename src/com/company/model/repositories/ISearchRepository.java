package com.company.model.repositories;

import com.company.model.entities.Car;

import java.util.ArrayList;

public interface ISearchRepository {
    public ArrayList<Car> getAllCars();
    public ArrayList < Car > getCarsBySearch(Car search);
}
