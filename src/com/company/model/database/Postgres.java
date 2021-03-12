package com.company.model.database; //package about the connection with db

import java.sql.Connection; //Connection
import java.sql.DriverManager; //DriverManager
import java.sql.SQLException; //Exception

public class Postgres implements IDB { //connection with db by using interface
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionURL = "jdbc:postgresql://localhost:5432/inkarrrrrrrr"; //name of database on postgresql
        try {
            Class.forName("org.postgresql.Driver"); //driver
            return DriverManager.getConnection(connectionURL, "postgres", "inkar2002"); //info about user
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
