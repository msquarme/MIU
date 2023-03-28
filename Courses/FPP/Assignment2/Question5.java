package Lesson2;
import java.util.*;


/*
* @author Musie M.
* ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 5: Write a java program to check the equality of two arrays? Two arrays are equal if each element 
* in the first array is equal to the second element,  for example
		Array1 = {1,3,5,6,6,7}
		Array2 = {1,3,5,6,6,7}
	The answer will be true.
	Another example
		Array1 = {1,3,5}
		Array2 = {1,3,5,7}
	The answer is false.
* 
*/
public class Question5 {

	
	
	// Check if there is any function available for ArrayList
	public boolean checkArrayEquality(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		// Now we know both arrays have equal size.
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # of arr_1");
		int arr_size = sc.nextInt();
		
		int[] arr = new int[arr_size];
		
		System.out.println("Enter # of arr_2");
		int arr1_size = sc.nextInt();
		
		int[] arr1 = new int[arr1_size];
		
		System.out.println("Accepting elements for Array1");
		for(int i = 0; i < arr_size; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Accepting elements for Array2");
		for(int i = 0; i < arr1_size; i++) {
			
			arr1[i] = sc.nextInt();
			
		}
		sc.close();
		
		Question5 q5 = new Question5();
		System.out.println("Array1 is equal to Array2 = " + q5.checkArrayEquality(arr, arr1));
		
	}
}
