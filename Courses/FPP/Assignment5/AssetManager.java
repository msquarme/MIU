package Lesson5;
/**
 * 
 * 
 * Question 6: Consider an asset-tracking program that will track four types of 
 * 				assets: electronic appliances, automobiles, furniture, and compact disks. What classes would you design for the program? Would you define four unrelated classes or one superclass and four subclasses? 
 * 				If you design a superclass, will it be an abstract superclass?
				Implement the asset-tracking program of Exercise 10. Allow the user to add, modify, and delete 
				electronic appliances, automobiles, furniture, and compact disks. Allow the user to list the assets by category and search for an asset by its serial number


		=========================ANSWER===========================
		
		Design
		--------
		
		An abstract superclass Asset with four subclasses Appliance , Automobile , Furniture , and CompactDisc is a good design. 
		Any number of different asset types may be added in the future by subclassing
		Asset and implementing any abstract methods it declares.
		
		Will have like this.
		
		Abstract Class: Asset
		Properties: type (string), serialNumber (string), datePurchased (date)
		Methods: getType(), getSerialNumber(), getDatePurchased(), setType(), setSerialNumber(), setDatePurchased()

		Subclasses: ElectronicAppliance, Automobile, Furniture, CompactDisk
		Properties: (depending on type of asset)
		Methods: (depending on type of asset)
 * 
 * 
 * 
 */
import java.util.ArrayList;

public class AssetManager {
	 
    private ArrayList<Asset> assets;
 
    public AssetManager() {
        this.assets = new ArrayList<>();
    }
 
    public void addAsset(Asset asset) {
        assets.add(asset);
    }
 
    public void removeAsset(Asset asset) {
        assets.remove(asset);
    }
 
    public void listAssetsByCategory(String type) {
        for (Asset asset : assets) {
            if (asset.getType().equals(type)) {
                System.out.println(asset);
            }
        }
    }
 
    public Asset getAssetBySerialNumber(String serialNumber) {
        for (Asset asset : assets) {
            if (asset.getSerialNumber().equals(serialNumber)) {
                return asset;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
    	
    	AssetManager AM = new AssetManager();
    	Furniture f = new Furniture(null, null, null, null, null);
    	
    	f.setSerialNumber("001");
    	f.setMaterial("Chair");
    	f.setType("Wood");
    	
    	
    	CompactDisk cd = new CompactDisk(null, null, null, null, null);
    	cd.setArtist("Chris Brown");
    	cd.setTitle("Breezy");
    	cd.setSerialNumber("00123");
    	
    	ElectronicAppliance EA = new ElectronicAppliance(null, null, null, null, null);
    	EA.setModel("S-12");
    	EA.setBrand("Samsung");
    	EA.setSerialNumber("001211");
    	
    }
}