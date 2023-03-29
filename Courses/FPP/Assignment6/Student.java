package Lesson6;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Six
* 			##################################
* 
* Question 3: 
	Create a Student class that has instance variables for the student’s last name and ID number,
along with appropriate constructors, accessors, and mutators.
		• Make the Student class implement the Comparable interface.
		• Define the compareTo method to order Student objects based on the student ID number.
		• In the main method, create an array of at least five Student objects, sort them using
		  Collections.sort, and output the students.
		• They should be listed by ascending student number.
		• Next, modify the compareTo method so it orders Student objects based on the
		  lexicographic ordering of their last name.
		• Without modification to the main method, the program should now output the students
		  ordered by name.
* 
*/ 



public class Student implements Comparable<Student> {

	
	private int ID;
	private String lastName;
	
	Student(int ID, String lastName){
		
		this.ID = ID;
		this.lastName = lastName;
	}
	Student(String lastName, int ID){
		
		this.lastName = lastName;
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int compareTo(Student stud){
		
		// Comparing Alphabetically with LastName
		return this.lastName.compareTo(stud.getLastName());
		
		//Sorting By ID
//		return (int) (this.ID - stud.getID());
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(3000,"Hadgu"));
		students.add(new Student(1000,"Berhe"));
		students.add(new Student(1001,"Hamid"));
		students.add(new Student(1002,"Abraha"));
		
		
		System.out.printf("\t%-22s%-22s\n","ID","Last Name");
		System.out.println("\t-------------------------------\n");
		
//		We can sort using Collections.sort(students) which will sort it and modify students.
//		We can also use stream() to sort but will not modify students. 
		
//		Collections.sort(students);
//		
//		for(Student s: students) {
//			System.out.printf("\t%-22s%-22s\n",s.getID(),s.getLastName());
//		}
		students.stream().sorted().forEach(stu -> System.out.printf("\t%-22s%-22s\n",stu.getID(),stu.getLastName()));
	
	}
	
	
}
