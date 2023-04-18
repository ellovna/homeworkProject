package com.HW;

public class ElectricCar extends Cars {

    private int batteryCapacity;
    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String model,
                       String color,
                       int averagePrice,
                       int batteryCapacity){
        super(model, color, averagePrice);
        this.batteryCapacity = batteryCapacity;
    }
}
