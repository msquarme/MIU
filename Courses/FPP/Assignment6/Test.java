package Lesson6;

import java.util.ArrayList;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Six
* 			##################################
* 
* This Test class is used to test the three classes.
* 		1. City
* 		2. CityComp // City Implementation of Comparable
* 		3. Interface
* 
*/ 

public class Test {
	
public static void main(String[] args) {
		
		City c = new City("New York");
		
		// temperature are in celcius
		c.setTemprature(25);
		System.out.println("Testing  City Class without Comparable\n");
		System.out.printf("\t%-22s%-22s\n","City Name","Temperature");
		System.out.println("\t---------------------------------");

		
		
		System.out.printf("\t%-22s%-22s\n",c.getCityName(),c.getTemprature());
		
		City c2 = new City("Chicago", 26);
		
		System.out.printf("\t%-22s%-22s\n",c2.getCityName(),c2.getTemprature());
		
		City c3 = new City(20,"San Francisco");
		
		
		System.out.printf("\t%-22s%-22s\n",c3.getCityName(),c3.getTemprature());
		
		City c4 = new City("Washington DC", 12);
		System.out.printf("\t%-22s%-22s\n",c4.getCityName(),c4.getTemprature());
		
		
		
		System.out.println("\nTesting  City Class after implementing Comparable and sorting by Temperature\n");
		
		ArrayList<CityComp> city = new ArrayList<>();
		
		city.add(new CityComp("New York", 25));
		city.add(new CityComp("Chicago", 16));
		city.add(new CityComp("Fairfield", 10));
		city.add(new CityComp("San Francisco", 20));
		city.add(new CityComp("LA", 31));
		
		city.add(new CityComp("Washington DC", 12));
		System.out.printf("\t%-22s%-22s\n","City","Temperature");
		System.out.println("\t---------------------------------\n");
		
//		Collections.sort(city);
//		
//		for(CityComp c: city) {
//			System.out.printf("\t%-22s%-22s\n",c.getCityName(),c.getTemperature());
//		}
//		
		city.stream().sorted().forEach(m-> System.out.printf("\t%-22s%-22s\n",m.getCityName(),m.getTemperature()));

		
		
		// Testing The Interface
		
		
		System.out.println("\nCalculating Area for different shapes (i.e. Circle and Rectangle)\n");
		Circle cir = new Circle(2);
		Rectangle r = new Rectangle(3, 4);
		ShowArea(cir);
		ShowArea(r);
		
		
		
		
		
	}
	
public static void ShowArea(Shape s) {
	
	double area = s.area();
	System.out.println("\tThe area of the shape is: " + area);
	
}

}
