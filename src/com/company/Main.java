package com.company;

import com.company.model.database.IDB;
import com.company.model.database.Postgres;
import com.company.model.repositories.AddRepository;
import com.company.model.repositories.IAddRepository;
import com.company.model.repositories.ISearchRepository;
import com.company.model.repositories.SearchRepository;
import com.company.view.Application;

public class Main {

    public static void main(String[] args) {
        IDB database = new Postgres();

        ISearchRepository searchRepository = new SearchRepository(database);
        IAddRepository addRepository = new AddRepository(database);

        Application app = new Application(searchRepository, addRepository);

        app.start();
    }
}
