package com.company.model.repositories;//package

import com.company.model.database.IDB;//connection
import com.company.model.entities.Car;//entity

import java.sql.Connection;//Connection
import java.sql.ResultSet;//ResultSet
import java.sql.Statement;//Statement
import java.util.ArrayList;//for arrays

public class SearchRepository implements ISearchRepository{ //Search repository implements interface ISearchRepository
    private final IDB db; //db

    public SearchRepository(IDB db) { //constructor
        this.db = db;
    }

    @Override
    public ArrayList<Car> getAllCars() { //show the list of car by calling getAllCars()
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        ArrayList < Car > res = new ArrayList<>(); //array

        try { //trycatch method to show the list of cars

            con = db.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from cars");

            while(rs.next()){
                res.add(new Car(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getInt(7), rs.getString(8)));
            }

            return res;


        } catch (Exception e){
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }

        return null;
    }

    @Override
    public ArrayList<Car> getCarsBySearch(Car search) { //array for searching the cars
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        ArrayList < Car > res = new ArrayList<>();

        try { //trycatch function to search cars
//connection
            con = db.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from cars");

            while(rs.next()){ //cycle to find the cars by special characteristics

                if(!search.getBrand().equals("0")){
                    if(!rs.getString(3).equals(search.getBrand())){
                        continue;
                    }
                }
                if(!search.getModel().equals("0")){
                    if(!rs.getString(4).equals(search.getModel())){
                        continue;
                    }
                }
                if(search.getYear() != 0){
                    if(rs.getInt(2) != search.getYear()){
                        continue;
                    }
                }
                if(search.getVolume() != 0){
                    if(rs.getFloat(6) != search.getVolume()){
                        continue;
                    }
                }

                res.add(new Car(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getFloat(6), rs.getInt(7), rs.getString(8)));
            }
//cycle will work till find your car
            return res;


        } catch (Exception e){
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }

        return null;
    }
}
