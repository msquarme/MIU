package Lesson4;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Four
* 			##################################
* 
* Question 2: Define a class called WordCount whose objects count the number of words in
a sentence. An object of this class maintains a variable count that is a
nonnegative integer. Include methods to set the counter to 0, to increase the
count by 1, and to decrease the count by 1 if any word encountered starts
with ‘A’ or ‘a’. Be sure that no method allows the value of the counter to
become negative. Include an accessor method that returns the current count
value and a method that outputs the count to the screen. There should be no
input method or other mutator methods. The only method that can set the
counter is the one that sets it to 0. Write a main class with a main method to
test your class (WordCount) 
 * 
 * */




import java.util.Scanner;

public class wordCount {

	private int count;
	
	public void resetCount() {
		System.out.println("-----------------------------");
		System.out.println("\t reset count");
		System.out.println("-----------------------------");
		this.count = 0;
	}
	public void decreaseCount() {
		
		
		System.out.println("-----------------------------");
		System.out.println("\t decrease count");
		System.out.println("-----------------------------");
		
		if(this.count >0) {
			
			this.count -= 1;
		}
		else {
			System.out.println("Error, count cannot be negative");
		}
	}
	
	public void increaseCount() {
		System.out.println("-----------------------------");
		System.out.println("\t increase count");
		System.out.println("-----------------------------");
		this.count += 1;
	}
	
	public void setCount(String s) {
		
		if(s == null || s.isEmpty()) {
			this.count = 0;
		}else {
			this.count = s.split("\\s+").length;
		}
	}
	
	public void displayCount() {
		
		System.out.println("The count is " + this.count);
	}
	
	public static void main(String[] args) {
		
		wordCount wc = new wordCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence");
		String input = sc.nextLine();
		sc.close();
		wc.setCount(input);
		 wc.displayCount();
		
		wc.decreaseCount();
		wc.displayCount();
		
		
		wc.decreaseCount();
		wc.displayCount();
		
		wc.decreaseCount();
		wc.displayCount();
		
		
		
		wc.decreaseCount();
		wc.displayCount();
		
		
		
		wc.decreaseCount();
		wc.displayCount();
		
		wc.increaseCount();
		wc.displayCount();
		
		wc.resetCount();
		wc.displayCount();
		

		wc.decreaseCount();
		
		
		wc.displayCount();

	}

}
