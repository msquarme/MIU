package Assignment1;
import java.util.Scanner;


/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 4: 
 *  
 *  Write a Java method that takes an array of strings and another string parameter
 *  as input and returns true if the array contains the string parameter and 
 *  returns false otherwise.
 * 
 * */

public class Question4 {
	
	public boolean ContainsString(String[] a, String b) {
		
		for(String check: a) {
			if(check.equals(b)) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("What do you want to be the length of the String array? \n");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] list = new String[length];
		
		sc.nextLine();
		
		
		System.out.println("Accepting Strings...\n");
		
		for(int i=0; i<length; i++) {
			list[i] = sc.nextLine();
		}
		
		System.out.println("Accepting a string to be checked in the String Array ");
		String b = sc.nextLine();
		Question4 q4 = new Question4();
		
		System.out.println("Checking if "+ b +" is String array: \n" + q4.ContainsString(list, b));
		
		
	}

}
