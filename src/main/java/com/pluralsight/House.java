package com.pluralsight;


public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    //todo: constructor
    public House(String description, String dateAcquired, Double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }

    //getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //todo: @override
    @Override
    public double getValue(){
        double priceperSqFt;

        switch (condition){
            case 1:
            priceperSqFt = 180;             //excellent
            break;
            case 2:
                priceperSqFt = 130;            //fair
                break;
            case 3:
                priceperSqFt = 90;
                break;
            case 4:
                priceperSqFt = 80;
                break;
            default:
                priceperSqFt = 0;
        }
        return (priceperSqFt * this.squareFoot + this.lotSize * 0.25);

    }

//    @Override
//    public double getValue(){
//
//        double basePricePerSqFt;
//
//    }
}
