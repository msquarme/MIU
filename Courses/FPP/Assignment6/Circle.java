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
* Question 2: 
	Define an interface named Shape with a single method named area that calculates the area of
the geometric shape:
				public double area();
				
Next, define a class named Circle that implements Shape.
The Circle class should have an instance variable for the radius, a constructor that sets the
radius, accessor/mutator methods for the radius, and an implementation of the area method.
Also define a class named Rectangle that implements Shape. The Rectangle class should
have instance variables for the height and width, a constructor that sets the height and width,
accessor and mutator methods for the height and width, and an implementation of the area
method.
* 
*/ 


public class Circle implements Shape {
	
	final double PI = 3.14;
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		
		return this.radius;
	}
	
	public double area() {
		
		return PI*Math.pow(getRadius(), 2);
	}

}
