package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Assets----");

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Rental", "July", 2000000.0, "345 Lane St", 1, 900, 45));
        assets.add(new House("Main home", "August", 252520.0, "356 Happy Lane", 3, 345, 23));
        assets.add(new House("Second home", "September", 230000.0, "200 Charlotte Rd", 1, 25, 150));

        assets.add(new Vehicle("1.", "July", 2500.00, "Honda CRV", 2014, 450000));
        assets.add(new Vehicle("2.", "October", 4500.00, "Ford Focus", 2025,250000));
        assets.add(new Vehicle("3.", "September", 5500.00, "Dodge Charger", 2024, 89500));


        for(Asset a : assets) {
            System.out.println(a.getDescription()
                                + " - Value: $"
                                + a.getValue());
        }
    }
}
