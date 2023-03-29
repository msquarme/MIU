package Lesson5;

import java.util.Date;

public class Automobile extends Asset {
	 
    private String make;
    private String model;
 
    public Automobile(String type, String serialNumber, Date datePurchased, String make, String model) {
        super(type, serialNumber, datePurchased);
        this.make = make;
        this.model = model;
    }
 
    public String getMake() {
        return make;
    }
 
    public void setMake(String make) {
        this.make = make;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    @Override
    public String toString() {
        return "Automobile{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
