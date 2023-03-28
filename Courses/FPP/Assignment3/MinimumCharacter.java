package Lesson3;
import java.util.*;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 2: Using recursion to find the minimum character in the given string input.
			If your input is “akel” in return ‘a’
 * 
 * */


public class MinimumCharacter {

	public char findMinCharacter(String s, int l, int r) {
		char min;
		if(l == r) {
			return s.charAt(r);
		}
		else {
			
			min = findMinCharacter(s, l+1, r);
			
			if(s.charAt(l) <= min) {
				return s.charAt(l);
			}
			else {
				return min;
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		
		MinimumCharacter mc = new MinimumCharacter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		
		// To avoid case insensitivity we convert the string received to Uppercase or Lowercase
		// In case we want it to be case sensitive.
		// we should use 
		// String input = sc.nextLine().toUpperCase();
		
		
		String input = sc.nextLine();
		
		sc.close();
		
		System.out.println(mc.findMinCharacter(input, 0,input.length()-1));
		
		
	}
	
	
}
