package Lesson5;

import java.util.Date;

public abstract class Asset {
 
    private String type;
    private String serialNumber;
    private Date datePurchased;
 
    public Asset(String type, String serialNumber, Date datePurchased) {
        this.type = type;
        this.serialNumber = serialNumber;
        this.datePurchased = datePurchased;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public String getSerialNumber() {
        return serialNumber;
    }
 
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
 
    public Date getDatePurchased() {
        return datePurchased;
    }
 
    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
    }
 
    @Override
    public String toString() {
        return "Asset{" +
                "type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", datePurchased=" + datePurchased +
                '}';
    }
}