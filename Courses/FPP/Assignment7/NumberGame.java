package Lesson8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;



/*
 * 
 * 
 * * @author Musie M.
 *  ID: 616079
 * 
 * 			##################################
 * 					Assignment Eight
 * 			##################################
 * 
 * 
 * Question 2: Develop a simple number game using swing that will display nine buttons 
 * 				displayed in a 3: 3 game board. 
			Nine random numbers will be generated, one corresponding to each button. 
			The numbers can be anything in the range of 1 to 50.
			 The buttons will be initially blank, and the player will be asked to select any three buttons. 
			As soon as the player selects a button, the corresponding number should be displayed at the bottom of the frame, finally displaying all three numbers selected by the player. 
			If one of the numbers selected is odd, the player gets a prize of $20; 
			if two are odd, the player gets a prize of $50; and 
			if all three numbers are odd, the player gets a prize of $100. Also,
			if any of the three selected numbers is 50, then there will be a bumper prize of $1000. 
			If any even number is selected, then the system should output “Better Luck Next Time!”

 * 
 * 
 * 
 * 
 * */
public class NumberGame extends JFrame implements ActionListener{
	
	int arr[] = new int[9];
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;
	JLabel result, resultMessage;
	
	private int counter=0;
	private int oddcounter;
	private boolean checkFifty = false;
	ArrayList<Integer> chosenNumbers = new ArrayList<>();
	
	public void checkFiftyOddCounter(int index) {
		
		if(arr[index] == 50) {
			checkFifty = true;
		}
		else if(arr[index] % 2 !=0 ) {
			oddcounter ++;
		}
	}
	
	NumberGame(){
		
		setTitle("Number Game!!");
		
		// Generate random numbers
		Random rand = new Random();
		for (int i = 0; i< arr.length; i++) {
			
			arr[i] = rand.ints(1,51).findAny().getAsInt();
		}
		
        btn1 = new JButton("1");
        btn1.setBounds(200, 100, 50, 30);
        
        btn2= new JButton("2");
        btn2.setBounds(250, 100, 50, 30);
        
        btn3 = new JButton("3");
        btn3.setBounds(300, 100, 50, 30);
        
        btn4 = new JButton("4");
        btn4.setBounds(200, 130, 50, 30);
        
        btn5 = new JButton("5");
        btn5.setBounds(250, 130, 50, 30);
        
        btn6 = new JButton("6");
        btn6.setBounds(300, 130, 50, 30);
        
        
        btn7 = new JButton("7");
        btn7.setBounds(200, 160, 50, 30);
        
        btn8 = new JButton("8");
        btn8.setBounds(250, 160, 50, 30);
        
        
        btn9 = new JButton("9");
        btn9.setBounds(300, 160, 50, 30);
        
        
        lb1 = new JLabel();
        lb1.setBounds(200,250,50,20);
        
        lb2 = new JLabel();
        lb2.setBounds(250,250,50,20);
        
        lb3 = new JLabel();
        lb3.setBounds(300,250,50,20);
        
        lb4 = new JLabel();
        lb4.setBounds(200,270,50,20);
        
        lb5 = new JLabel();
        lb5.setBounds(250,270,50,20);
        
        lb6 = new JLabel();
        lb6.setBounds(300,270,50,20);
        
        lb7 = new JLabel();
        lb7.setBounds(200,290,50,20);
        
        lb8 = new JLabel();
        lb8.setBounds(250,290,50,20);
        
        lb9 = new JLabel();
        lb9.setBounds(300,290,50,20);
        
        result = new JLabel("Result");
        result.setBounds(500,100,50,20);
        
        resultMessage = new JLabel();
        resultMessage.setBounds(500,120,200,20);
        
        
        JLabel Result = new JLabel("Selected Numbers are displayed below");
        Result.setBounds(150,200, 300,30);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(Result);
        
        add(lb1);
        add(lb2);
        add(lb3);
        
        add(lb4);
        add(lb5);
        add(lb6);
        
        add(lb7);
        add(lb8);
        add(lb9);
        
        add(result);
        add(resultMessage);
        
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

	}

	
	
	
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if(checkFifty) {
			resultMessage.setText("Bumper Prize!!");
		}
		else {
			

			if(counter < 3) {
				

				if(source == btn1) {
					System.out.println("btn1 is pressed");
					lb1.setText(String.valueOf(arr[0]));
					chosenNumbers.add(arr[0]);
					// check for fifty counter
					checkFiftyOddCounter(0);
				}
				else if(source == btn2) {
					System.out.println("btn2 is pressed");
					lb2.setText(String.valueOf(arr[1]));
					chosenNumbers.add(arr[1]);
					checkFiftyOddCounter(1);
				}
				else if(source == btn3) {
					System.out.println("btn3 is pressed");
					lb3.setText(String.valueOf(arr[2]));
					chosenNumbers.add(arr[2]);
					checkFiftyOddCounter(2);
				}
				else if(source == btn4) {
					System.out.println("btn4 is pressed");
					lb4.setText(String.valueOf(arr[3]));
					chosenNumbers.add(arr[3]);
					checkFiftyOddCounter(3);
				}
				else if(source == btn5) {
					System.out.println("btn5 is pressed");
					lb5.setText(String.valueOf(arr[4]));
					chosenNumbers.add(arr[4]);
					checkFiftyOddCounter(4);
				}
				
				else if(source == btn6) {
					System.out.println("btn6 is pressed");
					lb6.setText(String.valueOf(arr[5]));
					chosenNumbers.add(arr[5]);
					checkFiftyOddCounter(5);
				}
				else if(source == btn7) {
					System.out.println("btn7 is pressed");
					lb7.setText(String.valueOf(arr[6]));
					chosenNumbers.add(arr[6]);
					checkFiftyOddCounter(6);
				}
				else if(source == btn8) {
					System.out.println("btn8 is pressed");
					lb8.setText(String.valueOf(arr[7]));
					chosenNumbers.add(arr[7]);
					checkFiftyOddCounter(7);
				}
				else if(source == btn9) {
					System.out.println("btn9 is pressed");
					lb9.setText(String.valueOf(arr[8]));
					chosenNumbers.add(arr[8]);
					checkFiftyOddCounter(8);
				}
				counter++;
			}
			
			if(counter == 3) {
				switch(oddcounter) {
				case 1:
					resultMessage.setText("Prize 20");
					break;
				case 2:
					resultMessage.setText("Prize 50");
					break;
				case 3:
					resultMessage.setText("Prize 100");
				}
			}

		}		
	}
	public static void main(String[] args) {
		
		
		new NumberGame();
		        
        
	}

}
