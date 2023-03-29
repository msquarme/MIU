package Lesson5;

import java.util.Date;

public class ElectronicAppliance extends Asset {
	 
    private String brand;
    private String model;
 
    public ElectronicAppliance(String type, String serialNumber, Date datePurchased, String brand, String model) {
        super(type, serialNumber, datePurchased);
        this.brand = brand;
        this.model = model;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    @Override
    public String toString() {
        return "ElectronicAppliance{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
