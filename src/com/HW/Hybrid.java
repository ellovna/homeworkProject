package com.HW;


public class Hybrid extends Cars{
    private int battery;
    private int mpg;
    public int getBattery(){
        return battery;
    }
    public int getMpg(){
        return mpg;
    }
    public void setBattery(int battery){
        this.battery = battery;
    }
    public void setMpg(int mpg){
        this.mpg = mpg;
    }

    public Hybrid(String model,
                  String color,
                  int averagePrice,
                  int battery,
                  int mpg){
        super(model, color, averagePrice);
        this.battery = battery;
        this.mpg = mpg;
    }
}
