package com.HW;

public class UsedCars extends Cars {
    private int mileage;
    private int manufactureDate;
    public int getMileage(){
        return mileage;
    }
    public int getManufactureDate(){
        return manufactureDate;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void setManufactureDate(int manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    public UsedCars(String model,
                    String color,
                    int averagePrice,
                    int mileage,
                    int manufactureDate){
        super(model, color, averagePrice);
        this.mileage = mileage;
        this.manufactureDate = manufactureDate;
    }
}
