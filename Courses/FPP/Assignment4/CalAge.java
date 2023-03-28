package Lesson4;
import java.time.LocalDate;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Four
* 			##################################
* 
* Question 1: Define a class called CalAge. This class is used to calculate age of a person
from her or his date of birth and the current date. Include a mutator method
that allows the user to enter her or his date of birth and set the value for
current date. Also include a method to return the age in years and months
(for example, 25.5 years) as a double value. Include an additional method to
check if the date of birth entered by the user is a valid one. For example, 30
February 2008 is an invalid date. Embed your class in a test program. 
 * 
 * */



import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import  java.util.Scanner;
public class CalAge {
	
	private LocalDate currentTime;
	private LocalDate dob;
	private Period age;
	
	public LocalDate getTime() {
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("y-M-d");
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			String input = sc.nextLine();
			try {
				
				return LocalDate.parse(input, formatt);
			}
			catch(DateTimeParseException ex) {
				
				System.out.println("Invalid Time format! Enter your date correctly(yyy-mm-dd)");
			}
		}	

		
	}
	
	public void setDob() {
		System.out.println("Enter your date of birth");
		this.dob = getTime();
	}
	
	public LocalDate getDob() {
		
		return this.dob;
	}
	
	public Period getAge() {
		
		this.age = Period.between(this.dob, this.currentTime);
		return this.age;
	}
	
	
	public void setCurrentTime(LocalDate now) {
		
		this.currentTime = now;
	}
	
	public LocalDate getCurrentTime() {
		
		return this.currentTime;
	}
	
	
	
	public Double getAgeInYearsAndMonth() {
		
		return Double.parseDouble( this.age.getYears()+"." +this.age.getMonths());
	}
	
	
	public void mutantMethod() {
		
//		 update current time;
		System.out.println("\nInside Mutant method, Insert the current date");
		LocalDate updatedTime = getTime();
		setCurrentTime(updatedTime);
		
	}
	
	public void setDefaultCurrentTime() {
		
		
//		 set the system Time;
		setCurrentTime(LocalDate.now());
	}
	
	

	

}
