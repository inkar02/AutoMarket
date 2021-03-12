package com.company.model.repositories;

import com.company.model.database.IDB;
import com.company.model.entities.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchRepository implements ISearchRepository{
    private final IDB db;

    public SearchRepository(IDB db) {
        this.db = db;
    }

    @Override
    public ArrayList<Car> getAllCars() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        ArrayList < Car > res = new ArrayList<>();

        try {

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
    public ArrayList<Car> getCarsBySearch(Car search) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        ArrayList < Car > res = new ArrayList<>();

        try {

            con = db.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from cars");

            while(rs.next()){

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
