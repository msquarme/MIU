package Lesson5;

public class Clerk extends Employee{
	@Override
	public void addBonus() {
		
		System.out.println("Clerk bonus added!");
		salary = salary + 100;
	}
	
}