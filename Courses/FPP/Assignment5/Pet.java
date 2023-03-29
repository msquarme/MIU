package Lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet {

	private String name;
	private char type;
	
	public String getName() {
		return this.name;
	}
	
	public void setname(String name) {
		
		this.name = name;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Pet> animals = new ArrayList<>(); 
		System.out.println("Enter any word or character to continue and \"stop\" to terminate the program!! ");
		Scanner sc = new Scanner(System.in);
		String endWord = sc.nextLine().toLowerCase();
		String input;
		while(!endWord.equals("stop")) {
			Pet p = new Pet();
			System.out.println("Enter type of pet: c for Cat and d for Dog!");
			input = sc.nextLine();
			p.setType(input.charAt(0));
			System.out.println("Enter name of the pet");
			input = sc.nextLine();
			p.setname(input);
			// adding the pet to the ArrayList
			animals.add(p);
			System.out.println("Enter any word or character to continue and \"stop\" to terminate the program!! ");
			endWord = sc.nextLine().toLowerCase();	
			
		}
		sc.close();
		System.out.println("Name \t\t\tType");
		System.out.println("-----------------------------");
		for(Pet t: animals) {
			System.out.println(t.getName()+"\t\t\t"+ t.getType());
		}
		
		
	}
}


