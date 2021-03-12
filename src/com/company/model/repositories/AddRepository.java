package com.company.model.repositories;//package name

import com.company.model.database.IDB;//Interface from database
import com.company.model.entities.Car;//Import the Main entity

import java.sql.Connection;//Connection
import java.sql.PreparedStatement;//PreparedStatement
import java.sql.ResultSet;
import java.util.ArrayList;//in order to use arrays

public class AddRepository implements IAddRepository{ //class that implement Interface IAddRepository
    private final IDB db; //db

    public AddRepository(IDB db) { //constructor for db
        this.db = db;
    }

    @Override
    public void addCar(Car newCar) { //function to add new cars
        Connection con = null;//start

        ArrayList< Car > res = new ArrayList<>();//Array to show the list of cars

        try {
            con = db.getConnection(); //connection

            String sql = "insert into cars values (default, ?, ?, ?, ?, ?, ?, ?)"; //input values to table
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, newCar.getYear());//input year
            st.setString(2, newCar.getBrand());//input brand
            st.setString(3, newCar.getModel());//input model
            st.setInt(4, newCar.getMileage());//input mileage
            st.setFloat(5, newCar.getVolume());//input volume
            st.setInt(6, newCar.getPrice());//input price
            st.setString(7, newCar.getLocation());//place

            st.execute();
        } catch (Exception e){ //trycatch function for addRepository(car list)
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
