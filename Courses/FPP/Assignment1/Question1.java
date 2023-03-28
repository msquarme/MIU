package Assignment1;
import java.util.Scanner;
/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 1: 
 *  
 *  Write a Java method that takes an array of integers as input and returns 
 *  the average of that list.
 * 
 * */

public class Question1 {
	
	public float average(int[] a) {
		float sum = 0.0f;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
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
		Question1 q1 = new Question1();
		System.out.println("The average of the array is "+ q1.average(list));;
	}
}
