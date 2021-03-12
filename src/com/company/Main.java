package com.company; //package

import com.company.model.database.IDB; //connection
import com.company.model.database.Postgres;//postgresql
import com.company.model.repositories.AddRepository; //AddRepository
import com.company.model.repositories.IAddRepository; //IAddRepository
import com.company.model.repositories.ISearchRepository; //ISearchRepository
import com.company.model.repositories.SearchRepository; //SearchRepository
import com.company.view.Application; //Application

public class Main { //main

    public static void main(String[] args) {
        IDB database = new Postgres(); //connection
//get database info for both functions of console application
        ISearchRepository searchRepository = new SearchRepository(database);
        IAddRepository addRepository = new AddRepository(database);

        Application app = new Application(searchRepository, addRepository);//functions of our application

        app.start(); //start to use this console app by calling this
    }
}
