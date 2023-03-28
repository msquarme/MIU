package Assignment1;
import java.util.Scanner;


/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 2: 
 *  
 *  Write a Java method that takes an array of integers as input
 *  and returns an array that contains the count of the odd values and the 
 *  count of the even values in that list..
 * 
 * */


public class Question2 {
	
	public int[] CountEvenOdd(int[] a) {
		
		int evenCounter = 0;
		int oddCounter = 0;
		int[] evenOddCounter = new int[2];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				evenCounter++;
			}
			else {
				oddCounter++;
			}
		}
		
		// counted Even numbers are stored at index 0 and Odd numbers at index 1;
		evenOddCounter[0] = evenCounter;
		evenOddCounter[1] = oddCounter;
		
		return evenOddCounter;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("What do you want to be the length of the array? ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] list = new int[length];
		System.out.println("Accepting integers...");
		for(int i=0; i<length; i++) {
			list[i] = sc.nextInt();
		}
		Question2 q2 = new Question2();
		int[] counter = q2.CountEvenOdd(list);
		System.out.println("Counted EVEN numbers in the array " + counter[0]);
		System.out.println("Counted ODD numbers in the array " + counter[1]);
	}

}
