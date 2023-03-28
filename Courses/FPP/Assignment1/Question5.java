package Assignment1;
import java.util.Scanner;


/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 5: 
 *  
 *  Write a Java method that takes 3 integers as input and returns the 
 *  max number among them.
 * 
 * */


public class Question5 {
	
	public int maximum(int[] a) {
		
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three elements.");
		for(int i=0; i< a.length; i++) {
			a[i] = sc.nextInt();
		}
		Question5 q5 = new Question5();
		System.out.println("The maximum value from the three elements is " + q5.maximum(a));
	}
	

}
