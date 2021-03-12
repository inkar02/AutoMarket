package com.company.model.repositories;

import com.company.model.database.IDB;
import com.company.model.entities.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AddRepository implements IAddRepository{
    private final IDB db;

    public AddRepository(IDB db) {
        this.db = db;
    }

    @Override
    public void addCar(Car newCar) {
        Connection con = null;

        ArrayList< Car > res = new ArrayList<>();

        try {
            con = db.getConnection();

            String sql = "insert into cars values (default, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, newCar.getYear());
            st.setString(2, newCar.getBrand());
            st.setString(3, newCar.getModel());
            st.setInt(4, newCar.getMileage());
            st.setFloat(5, newCar.getVolume());
            st.setInt(6, newCar.getPrice());
            st.setString(7, newCar.getLocation());

            st.execute();
        } catch (Exception e){
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
