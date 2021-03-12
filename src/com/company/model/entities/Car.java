package com.company.model.entities;

public class Car {
    private int id;
    private int year;
    private String brand;
    private String model;
    private int mileage;
    private float volume;
    private int price;
    private String location;

    public Car(int year, String brand, String model, int mileage, float volume, int price, String location) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.volume = volume;
        this.price = price;
        this.location = location;
    }

    public Car(String brand, String model, int year, float volume){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.volume = volume;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", volume=" + volume +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }

    public String getInfo(){
        return "------------------------\n" + getBrand() + " " + getModel() + "  " + getYear() + "\n" + "Volume: " + getVolume() + "  Mileage: " + getMileage() + "\n"
                + getLocation() + "\n" + getPrice() + " TENGE";

    }
}
