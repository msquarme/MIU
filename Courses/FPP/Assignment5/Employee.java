package Lesson5;

public class Employee {
	
	protected String empID;
	protected String name;
	protected String department;
	protected double salary;
	
		
	public boolean equals(Object otherObject)
	{
	if (this == otherObject) 
		return true;
	else if (otherObject == null) 
		return false;
	// if the classes don't match, they can't be equal
	else if (getClass() != otherObject.getClass())
		return false;
	
	
	Employee other = (Employee) otherObject;
	// test whether the fields have identical values
	return name.equals(other.name)
	&& salary == other.salary
	&& empID.equals(other.empID)
	&& department.equals(other.department);
	}
	
	
	// Setting appropriate accessors and mutators
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}
	

	public void addBonus() {
		
		System.out.println("Bonus added!");
		salary = getSalary() + 200;
	}
	
	void displayDetails() {
		System.out.println("Details");
		System.out.println("------------------------------------");
		System.out.println("ID: " + getEmpID());
		System.out.println("Name: " + getName());
		System.out.println("Department: " + getDepartment());
		System.out.println("Salary: " + getSalary());
		System.out.println("------------------------------------");
	}
	
	
}


