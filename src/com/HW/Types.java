package com.HW;

public class Types extends Cars{
    private String type;
    private byte numDoors;

    public String getType(){
        return type;
    }
    public byte getNumDoors(){
        return numDoors;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setNumDoors(byte numDoors){
        this.numDoors = numDoors;
    }

    public Types(String model,
                 String color,
                 int averagePrice,
                 String type,
                 byte numDoors){
        super(model, color, averagePrice);
        this.type = type;
        this.numDoors = numDoors;
    }

}
