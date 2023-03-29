package Lesson5;

import java.util.Date;

public class Furniture extends Asset {
	 
    private String material;
    private String style;
 
    public Furniture(String type, String serialNumber, Date datePurchased, String material, String style) {
        super(type, serialNumber, datePurchased);
        this.material = material;
        this.style = style;
    }
 
    public String getMaterial() {
        return material;
    }
 
    public void setMaterial(String material) {
        this.material = material;
    }
 
    public String getStyle() {
        return style;
    }
 
    public void setStyle(String style) {
        this.style = style;
    }
 
    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
