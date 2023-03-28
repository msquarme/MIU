package Assignment1;
import java.util.Scanner;


/*
 * Author: Musie M.
 * 
 * ID: 616079
 *						#######################
 *							Assignment One
 *						#######################
 *  Question 6: 
 *  
 *  Write a java method that asks the user to enter several strings and stores 
 *  them in an array, then pass this array to a function that reverses the text 
 *  inside each element. Example ["peter","ali","sarah"] should become 
 *  ["retep","ila","haras"]
 * 
 * */



public class Question6 {
	
	public String[] AcceptString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many strings do you want to enter? ");
		int length = sc.nextInt();
		
		sc.nextLine();
		String[] input = new String[length]; 
		for(int i = 0; i< length; i++) {
			input[i] = sc.nextLine();
		}
		
		return input;
	}
	
	public void reverse(String[] a) {
		
		String tmpreverse = "";
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j< a[i].length(); j++) {
				
				tmpreverse  = a[i].charAt(j) + tmpreverse;
			}
			a[i] = tmpreverse;
			tmpreverse = "";
		}
		
		System.out.println("The reversed string are: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Question6  q6 = new Question6();
		String[] str = q6.AcceptString();
		
		q6.reverse(str);
	}

}
