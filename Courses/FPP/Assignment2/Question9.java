package Lesson2;
import java.util.*;

/*
* @author Musie M.
* ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
 * 
 * 
 * Question9 : A codon is a triplet of nucleotides that specifies a single amino acid (a protein is a
				sequence of amino acids). Write a program that outputs codons given a DNA (or
				RNA) sequence and stores them in an ArrayList. For example, if the input is
				GATTCGATC, the program stores GAT, TCG, and ATC in an ArrayList. If the
				length of an input string is not a multiple of 3, then ignore any leftover
				nucleotides. For example, if the input is GATTCGA, then output GAT and TCG.
				Repeat the operation until an empty string is entered. Output codons in the list
				using the for-each loop. Repeat the operation until an empty string is entered.
 * 
 * 
 * */


public class Question9 {

	
	public ArrayList<String> getCodon(){
		
		ArrayList<String> codon = new ArrayList<>();
		System.out.println("Enter your DNA or RNA sequence...: ");
		Scanner sc = new Scanner(System.in);
		
		String sequence = "";
		sequence = sc.nextLine();
		
		sc.close();
		
		// Ignoring any leftover. 
		int length = (sequence.length()/3)*3;
		for(int i = 3; i <= length; i+=3) {
			
			codon.add(sequence.substring(i-3,i));
		}
		
		
		return codon;
	}
	
	public static void main(String[] args) {
		
		Question9 q9 = new Question9();
		
		System.out.println("Codons are: " + q9.getCodon());
	}
}
