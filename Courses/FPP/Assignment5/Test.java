package Lesson5;

public class Test {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		Manager m = new Manager();
		Clerk c = new Clerk();
		
		// mutating employee details
		
		emp.setEmpID("miu001");
		emp.setName("Prof. Sanad");
		emp.setDepartment("Computer Science");
		emp.setSalary(5000);
		emp.addBonus();
		
		// displaying emp
		
		
		// accessing employe details
		emp.displayDetails();
		
		// or we can use
		// emp.getEmpID();
		// emp.getName()
		
		// mutating manager details
		m.setEmpID("miu002");
		m.setName("Prof. X");
		m.setDepartment("Management");
		m.setSalary(6000);
		m.addBonus();
		
		// accessing manager details
		m.displayDetails();
		
		
		// mutating clerk details
		c.setEmpID("miu003");
		c.setName("Prof. X");
		c.setDepartment("Utility");
		c.setSalary(3000);
		c.addBonus();
		
		// accessing clerk details
		c.displayDetails();
		
		System.out.println("=================== Binding=================");
		
		// Upcasting
		Employee  emp1 = new Manager();
		
		emp1.setSalary(400);
		
		Employee emp2 = new Clerk();
		
		emp2.setSalary(300);
		
		// a new manager bonus will be added to an Employee. i.e 300
		emp1.addBonus();
		System.out.println(emp1.getSalary());
		
		emp2.addBonus();
		System.out.println(emp2.getSalary());
		
		// Downcasting
		Clerk c1 = (Clerk) emp2;
		c1.setName("New Clerk");
		c1.setSalary(100);
		c1.addBonus();
		System.out.println(c1.getName());
		System.out.println(c1.getSalary());
		
		
		
		// Checking the equal object;
		System.out.println("\n========================= Checking the equal object =================");
		System.out.println("checking if c1 equals with c " + c1.equals(c));
		System.out.println("checking if emp equals with m " + emp.equals(m));
		System.out.println("checking if emp1 equals with emp1 " + emp1.equals(emp1));
		
		

	}

}
