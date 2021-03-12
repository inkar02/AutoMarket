package com.company.model.repositories; //package

import com.company.model.entities.Car; //import the entity package and Car class

import java.util.ArrayList; //used for initialize arrays

public interface ISearchRepository { //interface for search repository part
    public ArrayList<Car> getAllCars();
    public ArrayList < Car > getCarsBySearch(Car search);
}

