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

    @Override
    public double getValue(){
        int currentYear = 2025;
        int age = currentYear - year;
        double value = getOriginalCost();


        if(age <= 3){
            value -= value * 0.03 * age;
        } else if (age <= 6) {
            value -= value * 0.06 * age;
        } else if (age <= 10){
            value -= value * 0.08 * age;
        } else{
            value -= 1000;
        }
//honda or toyota

        String makeModelLower = makeModel.toLowerCase();
        if(odometer > 100000 && !(makeModelLower.contains("honda")
                || makeModelLower.contains("toyota"))); {
                    value *= 0.75;
        }

        //value never = - , make 0
        return value < 0 ? 0: value;


    }
}

