package Lesson5;

public class Manager extends Employee{
	
	@Override
	public void addBonus() {
		System.out.println("Manager bonus added!");
		salary = salary + 300;
	}
	
	
}