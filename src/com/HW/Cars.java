package com.HW;

public abstract class Cars {

    // fields/properties
    private String model;
    private String color;
    private int averagePrice;

    //constructors
    //protected abstract void Cars();
    //};

    public Cars(String model, String color, int averagePrice) {
        this.model = model;
        this.color = color;
        this.averagePrice = averagePrice;
    }

    //Getter method
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    public int getAveragePrice() {
        return averagePrice;
    }

    // Setter method
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    public void show() {
        System.out.println("model: " + this.getModel());
        System.out.println("color: " + this.getColor());
        System.out.println("averagePrice: " + this.getAveragePrice());
    }
}

