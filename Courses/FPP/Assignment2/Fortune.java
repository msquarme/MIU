package Lesson2;
import java.util.*;

/*
 * 
 * @author Musie M.
* ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 4: Using a list (ArrayList), write a fortune telling program. Repeatedly prompt the user with the message
			Fortune (Y/N)?
	If the user enters Y, then display a randomly selected fortune from the list. If the
	user enters N, then stop the program. Define the class named Fortune. You can
	define and use a separate main class or include the main method in the Fortune
	class. Create the fortune list in the constructor. Include at least ten fortunes. The
	following are sample fortunes you can use:
 * 
 * 				> You will get 4.0 GPA this semester.
 * 				> Happiness is programming.
				> Satisfaction follows hard work.
				> Patience is virtue.
 * 
 * 
 * */


public class Fortune {
	
	private ArrayList<String> listOfFortunes;

	public Fortune() {
		
		// Adding 10 fortunes to the Array List 
		listOfFortunes = new ArrayList<String>();
		
		listOfFortunes.add("You will get 4.0 GPA this semester.");
		listOfFortunes.add("Happiness is programming.");
		listOfFortunes.add("Satisfaction follows hard work.");
		listOfFortunes.add("Patience is virtue.");
		listOfFortunes.add("Fairfield is cold.");
		listOfFortunes.add("TM is amazing.");
		listOfFortunes.add("You should meditate everyday.");
		listOfFortunes.add("Sport is important for your health.");
		listOfFortunes.add("I believe I can fly.");
		listOfFortunes.add("Hiking is the good for social gathering.");
		listOfFortunes.add("God is good.");
		listOfFortunes.add("Eating fruits builds immunity.");
		
	}
	public ArrayList<String> readingFortune(){
		
		ArrayList<String> listOfFortunes = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String check = "";
		String input = "";
		System.out.println("Fortune (Y/N) ?");
		check = sc.nextLine();
		while(check.equals("Y") || check.equals("y")) {
			System.out.println("Saving fortunes to ArrayList");
			input = sc.nextLine();
			
			listOfFortunes.add(input);
			
			System.out.println("Fortune (Y/N) ?");
			check = sc.nextLine();
		}
			
		sc.close();
		return listOfFortunes;
	}
	
	public void fortuneTeller() {
		
		
		int index = 0;
		
		System.out.println("Welcome to Fortune Teller Program: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fortune (Y/N) ?");
		String check = sc.nextLine();
		Fortune fortune = new Fortune();
		
		while(check.equals("Y") || check.equals("y")) {
			
			// Getting an index randomly between the size of listOfFortunes
			index = (int)Math.floor(Math.random()*fortune.listOfFortunes.size());
			
			System.out.println(fortune.listOfFortunes.get(index));
			System.out.println("Fortune (Y/N) ?");
			check = sc.nextLine();
		}
			
		sc.close();
		
		
		
	}
	
	public static void main(String[] args) {
		Fortune f = new Fortune();
		f.fortuneTeller();
	}
}
