package com.HW;

public class GasolineCar extends Cars {
    private int mpg;

//    public GasolineCar() {
//    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public GasolineCar(String model,
                       String color,
                       int averagePrice,
                       int mpg) {
        super(model, color, averagePrice);
        this.mpg = mpg;
    }
}
