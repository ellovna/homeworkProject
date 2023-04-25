package com.HW;

public class ElectricCar extends Cars implements BatteryReplacement, BatteryPrice, BatteryCharge {


    private int batteryCapacity;

    public ElectricCar(String model, String color, int averagePrice, int batteryCapacity) {
        super(model, color, averagePrice);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void showBatteryReplacement(){
        System.out.println("Battery doesn't need replacement for the next 10 years.");
    }

    public void getBatteryPrice(){
        System.out.println("Check the price before buying!");
    }
    public void getBatteryCharge(){
        System.out.println("For Electric Cars: charge it every 3 days");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() +
                "\nColor: " + getColor() +
                "\nAveragePrice: " + getAveragePrice() +
                "\nBatteryCapacity: " + getBatteryCapacity();
    }

}

    //public ElectricCar(String model,
                       //String color,
                       //int averagePrice,
                       //int batteryCapacity){
        //super(model, color, averagePrice);
        //this.batteryCapacity = batteryCapacity;




