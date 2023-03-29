package Lesson6;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Six
* 			##################################
* 
* Question 1: 
	* class City {
			private String cityName;
			private double temperature;
		}
Flesh out the class with appropriate accessors, constructors, and mutators. The
temperatures are assigned by you and can be set from outside the City class—your code does not
have to ensure that they are unique.
Next, modify the class so that it implements the Comparable interface.
The class also overrides the compareTo method. This method imposes an order between
instances of the City class depending upon their temperature.
Test your class by creating an array of sample temperatures and sort them in an ascending
order using a sorting method that takes as input an array of type Comparable.
* 
* 
*/ 

public class CityComp implements Comparable<CityComp>{
	private String cityName;
	private double temperature;
	
	
	// Constructor
	
	CityComp(String cityName, double temperature){
		this.cityName = cityName;
		this.temperature = temperature;
	}
	
	
	// Mutators and Accessors
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	
	// Comparing using temperature
	
	@Override
	public int compareTo(CityComp city){
		
//		if (this.temperature == city.getTemperature()) {
//			
//			return 0;
//		}
//		else if(this.temperature > city.getTemperature()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//		
		
		return (int)(this.temperature - city.getTemperature());
	}
	
		

}
