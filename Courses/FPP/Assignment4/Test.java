package Lesson4;

public class Test {

	
	public static void main(String[] args) {
		System.out.println("Calculate your age based on the system time");
		
//		Embedding CalAge class in Test 
		
		CalAge ca = new CalAge();
		
		ca.setDefaultCurrentTime();
		ca.setDob();
		
		System.out.println("Your Age based on the current date is: "  + ca.getAge().getYears() + " Years, "+
				  ca.getAge().getMonths() + " Months, " +
				  ca.getAge().getDays() + " Days, "
				 + ca.getAgeInYearsAndMonth() + " Years.Months ");


		ca.mutantMethod();
		
		ca.setDob();
		System.out.println("Your Age based on the Mutant date is: "  + ca.getAge().getYears() + " Years, "+
				  ca.getAge().getMonths() + " Months, " +
				  ca.getAge().getDays() + " Days, "
				 + ca.getAgeInYearsAndMonth() + " Years.Months ");
		
			
		
	}


	
}
