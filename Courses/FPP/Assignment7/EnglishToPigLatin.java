package Lesson8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * * @author Musie M.
 *  ID: 616079
 * 
 * 			##################################
 * 					Assignment Eight
 * 			##################################
 * 
 * 
 *  Question 1. Design and code a Swing GUI to translate text that is input in English into Pig Latin. You can assume that the sentence contains no punctuation. 
 *  The rules for Pig Latin are as follows:

    • For words that begin with consonants, move the leading consonant to the end of the word 
    	and add “ay.” Thus, “ball” becomes “allbay”; “button” becomes “uttonbay”; and so forth.
    • For words that begin with vowels, add “way” to the end of the word. 
    	Thus, “all” becomes “allway”; “one” becomes “oneway”; and so forth.
 * 
 * 
 */



public class EnglishToPigLatin {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("English to Pig Latin Translator");
		
		JLabel labelTitle = new JLabel("Welcome to English/Pig Latin translator");
		
		labelTitle.registerKeyboardAction(null, null, 0);
		
		labelTitle.setBounds(220, 15, 300, 70);
		
		JLabel englishLabel = new JLabel("English");
		JLabel pigLabel = new JLabel("Pig Latin");
		
		JButton btn = new JButton("translate");
		
		btn.setBounds(300, 200, 100, 50);
		
		englishLabel.setBounds(50,70,200,15);
		pigLabel.setBounds(400, 70, 200, 15);
		
		
		
		JTextField textEnglish = new JTextField();
		
		textEnglish.setBounds(50,90,250,40);
		
		JTextField textPig = new JTextField("Your Pig Latin Translation!");
		textPig.setBounds(400, 90, 250, 40);
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String englishText = textEnglish.getText();
				
				String pig = "";
				for(String s : englishText.split(" ")) {
					
					
					if(s.toLowerCase().charAt(0) == 'a' || s.toLowerCase().charAt(0) == 'e' || s.toLowerCase().charAt(0) == 'i' || s.toLowerCase().charAt(0) == 'o' || s.toLowerCase().charAt(0) == 'u') {
						
						pig =  pig + " " + s + "way";
					}
					else {
						pig = pig + " " + s.substring(1) + s.charAt(0) + "ay";
					}
				}
				textPig.setText(pig);
				
			}
		});
		
		jf.add(labelTitle);
		jf.add(englishLabel);
		jf.add(textEnglish);
		
		jf.add(textPig);
		jf.add(pigLabel);
		
		jf.add(btn);
		
		
		jf.setSize(800,500);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
		
		
		
	}

}
