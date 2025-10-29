package com.pluralsight;

public class Asset {

    private String description;
    private String dateAcquired;
    private double originalCost;

    //constructor
    public Asset(String description, String dateAcquired, Double originalCost){
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue(){
        return originalCost;

 }

    @Override
    public String toString() {
        return "Description: " + description + "\n" +
                "Date Acquired: " + dateAcquired + "\n" +
                "Original Cost: $" + originalCost + "\n" +
                "Current Value: $" + getValue();
    }
    }

