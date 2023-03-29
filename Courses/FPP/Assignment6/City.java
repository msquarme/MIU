package Lesson6;


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



public class City {

	private String cityName;
	private double temprature;
	
	
	//Creating City with different constructor parameters
	
	City(String cityName, double temprature){
		this.cityName = cityName;
		this.temprature = temprature;
		
	}
	
	City(double temprature, String cityName){
		this.cityName = cityName;
		this.temprature = temprature;	
	}
	
	
	City(String cityName){
		this.cityName = cityName;
	}
	
	
	// Accessors and Mutators
	
	
	public String getCityName() {
		return cityName;
	}
	
	public double getTemprature() {
		return temprature;
	}
	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}
	
	
	
}
