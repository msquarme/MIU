package Assignment1;
import java.util.Scanner;


/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 3: 
 *  
 *  Write a Java method that does the same functionality as Question 2 
 *  but the method this time should return an integer indicating the number 
 *  of even numbers, but your program should print the count of the even 
 *  numbers and the count of the odd numbers.
 * 
 * */

public class Question3 {
	
	public int CountEven(int[] a) {
		
		int evenCounter = 0;
		for(int i=0; i< a.length; i++) {
			
			if(a[i]%2==0) {
				evenCounter++;
			}
		}
		
		return evenCounter;
		
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
		Question3 q3 = new Question3();
		int even = q3.CountEven(list);
		
		// Counting the ODD, we use to subtract counted even numbers from list.length
		
		System.out.println("Counted EVEN numbers in the array " + even);
		System.out.println("Counted ODD numbers in the array " + (list.length - even));
	}

}
