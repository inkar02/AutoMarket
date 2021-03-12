package com.company.view;

import com.company.controller.AddController;
import com.company.controller.SearchController;
import com.company.model.entities.Car;
import com.company.model.repositories.IAddRepository;
import com.company.model.repositories.ISearchRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private final AddController addController;
    private final SearchController searchController;

    public Application(ISearchRepository searchRepo, IAddRepository addRepo){
        addController = new AddController(addRepo);
        searchController = new SearchController(searchRepo);
    }


    public void start(){
        System.out.println("Hello, welcome to auto market!");

        Scanner in = new Scanner(System.in);

        int choice;

        while(true){
            System.out.println("1: View cars");
            System.out.println("2: Add you car to our marketplace");
            System.out.println("0: Exit");

            choice = in.nextInt();

            if(choice == 1){
                System.out.println("1: Search cars");
                System.out.println("2: Show all cars");
                System.out.println("#: Return");

                choice = in.nextInt();

                if(choice == 1){
                    String brand = null, model = null;
                    Integer year = null;
                    Float volume = null;
                    int mile;
                    System.out.println("![write 0 if not important]!");
                    System.out.println("Input brand: ");
                    brand = in.next();
                    System.out.println("Input model: ");
                    model = in.next();
                    System.out.println("Input year: ");
                    year = in.nextInt();
                    System.out.println("Input engine volume: ");
                    volume = in.nextFloat();

                    searchCars(brand, model, year, volume);


                } else if(choice == 2){
                    showAllCars();
                } else {
                    continue;
                }

            } else if(choice == 2){
                int year;
                String brand, model, location;
                int price, mileage;
                Float volume;
                System.out.println("Input brand: ");
                brand = in.next();
                System.out.println("Input model: ");
                model = in.next();
                System.out.println("Input year: ");
                year = in.nextInt();
                System.out.println("Input mileage: ");
                mileage = in.nextInt();
                System.out.println("Input engine volume: ");
                volume = in.nextFloat();
                System.out.println("Input price");
                price = in.nextInt();
                System.out.println("Input location");
                location = in.next();

                addCar(new Car(year, brand, model,mileage, volume, price, location));


            } else {
                System.exit(0);
            }

        }

    }

    void searchCars(String brand, String model, int year, Float volume){
        ArrayList < Car > cars = searchController.getCarsBySearch(new Car(brand, model, year, volume));
        if(cars.size() == 0){
            System.out.println("Sorry, we don't have this car");
        } else {
            System.out.println("We found " + cars.size() + " cars: ");
        }
        for(Car car : cars){
            System.out.println(car.getInfo());
        }
    }
    void showAllCars(){
        ArrayList < Car > cars = searchController.getAllCars();
        for(Car car : cars){
            System.out.println(car.getInfo());
        }
    }

    void addCar(Car car){
        addController.addCar(car);
        System.out.println("----------------------- \n Success! We added your car to our marketplace \n ----------------------- \n");
    }

}
