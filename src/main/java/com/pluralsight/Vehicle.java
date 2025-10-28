package com.pluralsight;

public class Vehicle extends Asset{

    //properties
    private String makeModel;
    private int year;
    private int odometer;


    //todo: constructor
    public Vehicle(String description, String dateAcquired, Double originalCost,
                   String makeModel, int year, int odometer){

        //has to be in order
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }


    //getters and setters

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

}
