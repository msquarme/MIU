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
* Question 4: Write a java program to find the largest and smallest element in an array of integers? 
* for example if we have this array {1,4,-9,33,19,78,5} it should return 78 is the maximum and the 
* minimum is -9.
* 
*/

public class Question4 {
	
	public int[] findMaxMin(int[] a) {
		
		int maxMin[] = new int[2];
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i< a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		maxMin[0] = max;
		maxMin[1] = min;
		
		return maxMin;
	}
	
	public static void main (String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element #");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Accepting elements....\n");
		for(int i = 0; i < size; i++ ) {
			
			arr[i] = sc.nextInt();
		}
		sc.close();
		Question4 q4 = new Question4();
		
		int[] maxMin = q4.findMaxMin(arr);
		System.out.println("Maximum element from the array " + maxMin[0] +"\nMinimim element from the array " + maxMin[1]);
	}

}
