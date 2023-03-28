package Lesson3;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 1: For this exercise, you will write your own exponential function. Use the fact that for any
(real number) x and any natural number n > 0,

	 write a recursive function
					double power (double x, int n)
		that returns x^n and that uses only multiplication (and addition and subtraction if necessary) for
		its computation. (For this exercise, do not use the Math function pow(x,n).) Enclose the function
		in a class called Exponential. 
 * 
 * */



public class Exponential {
	
	public double power(double x, int n) {
		
		if(n == 1) {
			return x;
		}
		 return  power(x,n-1)*x;
	}

	public static void main(String[] args) {
		
		Exponential ex = new Exponential();
		
		System.out.println(ex.power(3, 10));

	}

}
