package com.company.model.entities; //package

public class Car { //table car
    private int id;
    private int year;
    private String brand;
    private String model;
    private int mileage;
    private float volume;
    private int price;
    private String location;

    public Car(int year, String brand, String model, int mileage, float volume, int price, String location) { //constructor for 'Car'
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.volume = volume;
        this.price = price;
        this.location = location;
    }

    public Car(String brand, String model, int year, float volume){ //second one
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.volume = volume;
    }


//getters and setters
    public int getId() {
        return id; //used to get ID
    }

    public void setId(int id) {
        this.id = id; //used to set ID
    }

    public int getYear() {
        return year; //used to get the year of car
    }

    public void setYear(int year) {
        this.year = year; //set year
    }

    public String getBrand() {
        return brand; //used to get brand
    }

    public void setBrand(String brand) {
        this.brand = brand; //set brand
    }

    public String getModel() {
        return model; //get model
    }

    public void setModel(String model) {
        this.model = model;//set model
    }

    public int getMileage() {
        return mileage; //get Mileage
    }

    public void setMileage(int mileage) {
        this.mileage = mileage; //set mileage
    }

    public float getVolume() {
        return volume; //get the volume
    }

    public void setVolume(float volume) {
        this.volume = volume; //set the volume
    }

    public int getPrice() {
        return price; //get price
    }

    public void setPrice(int price) {
        this.price = price; //set price
    }

    public String getLocation() {
        return location; //get the place
    }

    public void setLocation(String location) {
        this.location = location; //set location
    }

    @Override
    public String toString() { //used to show all of characteristics on console together
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
                + getLocation() + "\n" + getPrice() + " TENGE"; //used to show the all info about car

    }
}
