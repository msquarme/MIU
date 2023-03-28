package Lesson4;

import java.util.Scanner;


/*
 * 
 * @author Musie M.
*  ID: 616079
* 
* 			##################################
* 					Assignment Four
* 			##################################
* 
* Question 3: Write a grading program for a class with the following grading policies: a.
There are three quizzes, each graded on the basis of 10 points. b. There is
one midterm exam, graded on the basis of 100 points. c. There is one final
exam, graded on the basis of 100 points. The final exam counts for 40% of
the grade. The midterm counts for 35% of the grade. The three quizzes
together count for a total of 25% of the grade. (Do not forget to convert the
quiz scores to percentages before they are averaged in.) Any grade of 90 or
more is an A, any grade of 80 or more (but less than 90) is a B, any grade of
70 or more (but less than 80) is a C, any grade of 60 or more (but less than
70) is a D, and any grade below 60 is an F. The program should read in the
student’s scores and output the student’s record, which consists of three quiz
scores and two exam scores, as well as the student’s overall numeric score
for the entire course and final letter grade.
 * 
 * */





public class GradingStudent {
	
	private float quizOne = 0.0f;
	private float quizTwo = 0.0f;
	private float quizThree = 0.0f;
	private float midExam = 0.0f;
	private float finalExam = 0.0f;
	
	private float percentageGrade;
	private char letterGrade;
	
	


	public float getQuizOne() {
		return quizOne;
	}






	public void setQuizOne(float quizOne) {
		this.quizOne = quizOne;
	}






	public float getQuizTwo() {
		return quizTwo;
	}






	public void setQuizTwo(float quizTwo) {
		this.quizTwo = quizTwo;
	}






	public float getQuizThree() {
		return quizThree;
	}






	public void setQuizThree(float quizThree) {
		this.quizThree = quizThree;
	}






	public float getMidExam() {
		return midExam;
	}






	public void setMidExam(float midExam) {
		this.midExam = midExam;
	}






	public float getFinalExam() {
		return finalExam;
	}


	public float getPecercentageGrade() {
		return this.percentageGrade;
	}



	public void setFinalExam(float finalExam) {
		this.finalExam = finalExam;
	}
	
	public void insertData() {
		float input;
		System.out.println("Welcome to Grading System.\nThere are Three quizes. One Midterm and One final exam.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Quiz One. Value should be between 0-10");
		
		input = sc.nextFloat();
		
		while(input < 0 || input > 10) {
			
			System.out.println("Invalid input, quiz value should be between, 0-10");
			input=sc.nextFloat();
		}
		
		setQuizOne(input);
		
		
		System.out.println("Enter Quiz Two. Value should be between 0-10");
		
		input=sc.nextFloat();
		
		while(input < 0 || input > 10) {
			
			System.out.println("Invalid input, quiz value should be between, 0-10");
			input=sc.nextFloat();
		}
		
		setQuizTwo(input);
		
		System.out.println("Enter Quiz Three. Value should be between 0-10");
		
		input=sc.nextFloat();
		
		while(input < 0 || input > 10) {
			
			System.out.println("Invalid input, quiz value should be between, 0-10");
			input=sc.nextFloat();
		}
		
		setQuizThree(input);
		
		
		System.out.println("Enter Mid Exam. Value should be between 0-100");
		
		input=sc.nextFloat();
		
		while(input < 0 || input > 100) {
			
			System.out.println("Invalid input, quiz value should be between, 0-100");
			input=sc.nextFloat();
		}
		
		setMidExam(input);
		
		System.out.println("Enter Final Exam. Value should be between 0-100");
		
		input=sc.nextFloat();
		
		while(input < 0 || input > 100) {
			
			System.out.println("Invalid input, quiz value should be between, 0-100");
			input=sc.nextFloat();
		}
		
		setFinalExam(input);
		sc.close();
			
		
	}
	
	public float calculateQuizPercentage() {
		
//		 converting the the quizzes into percentage
//		System.out.println("Converting quizzes to percentage  ");
		return (this.quizOne + this.quizTwo + this.quizThree) * (5.0f/6);
	}
	
	public float calculateMidExamPercentage() {
		
//		 mid exam covers 35%
//		System.out.println("Converting mid exam to percentage");
		return this.midExam * 0.35f;
	}
	
	public float calculateFinalExamPercentage() {
//		final exam covers 45%
//		System.out.println("Converting final exam to percentage"+ this.finalExam * 0.45f);
		return this.finalExam * 0.45f;
	}

	public void calculateTotalPercentage() {
		
//		 TotalGrade = quizzes + midExam + finalExam 
//		System.out.println("Calculating total score out of 100");
		this.percentageGrade = calculateFinalExamPercentage() + calculateMidExamPercentage() + calculateQuizPercentage();
		
	}
	public char getLetterGrade() {
		
		System.out.println("Your grade in letters (i.e. A,B,C,D and F)");
		
		if(this.percentageGrade >= 90) {
			this.letterGrade = 'A';
		}
		else if(this.percentageGrade >= 80) {
			this.letterGrade = 'B';
		}
		else if(this.percentageGrade >= 70) {
			this.letterGrade = 'C';
		}
		else if(this.percentageGrade >= 60) {
			this.letterGrade = 'D';
		}
		else {
			this.letterGrade = 'F';
		}
		
		return this.letterGrade;
	}
	

	public static void main(String[] args) {
		
		GradingStudent GS = new GradingStudent();
		
		GS.insertData();
		GS.calculateTotalPercentage();
		System.out.println("Your score out of 100\n" + GS.getPecercentageGrade());
		System.out.println(GS.getLetterGrade());
		
	}





	
}
