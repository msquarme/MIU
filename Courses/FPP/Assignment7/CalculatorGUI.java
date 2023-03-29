package Lesson8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * 
 * @author Musie M.
 *  ID: 616079
 * 
 * 			##################################
 * 					Assignment Eight
 * 			##################################
 * 
 * 
 * Question 3: Design and code a Swing GUI calculator. 
		Your calculator will have two text fields that the user cannot change: 
		One labeled "Result" will contain the result of performing the operation, 
		and the other labeled "Operand" will be for the user to enter a number to be added, 
		subtracted, and so forth from the result. 
		
		The user enters the number for the "Operand" text field by clicking buttons labeled with the digits 0 through 9 and a decimal point, just as in a real calculator.
		
		Allow the operations of addition, subtraction, multiplication, and division.
		
		When the user clicks a button for an operation, the following occurs: 
		the operation is performed, the "Result" text field is updated, and the "Operand" text field is cleared. 
		Include a button labeled "Reset" that resets the "Result" to 0.0. Also
		include a button labeled "Clear" that resets the "Operand" text field so it is blank.

 * 
 * 
 * 
 * 
 * */


public class CalculatorGUI extends JFrame {
   
   private JPanel rootPanel;
   private JTextField operandTextField;
   private JTextField resultTextField;
   private JButton resetButton;
   private JButton clearButton;
   private JButton addButton;
   private JButton subtractButton;
   private JButton multiplyButton;
   private JButton divideButton;
   private JButton[] numberButtons;
   
   private double result = 0.0;
   
   public CalculatorGUI(){
      // Set up root panel
      rootPanel = new JPanel();
      rootPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
      
      // Create text fields
      operandTextField = new JTextField(20);
      operandTextField.setEditable(false);
      resultTextField = new JTextField(20);
      resultTextField.setEditable(false);
      
      // Create operation buttons
      resetButton = new JButton("Reset");
      resetButton.addActionListener(new ResetListener());
      clearButton = new JButton("Clear");
      clearButton.addActionListener(new ClearListener());
      addButton = new JButton("+");
      addButton.addActionListener(new AddListener());
      subtractButton = new JButton("-");
      subtractButton.addActionListener(new SubtractListener());
      multiplyButton = new JButton("*");
      multiplyButton.addActionListener(new MultiplyListener());
      divideButton = new JButton("/");
      divideButton.addActionListener(new DivideListener());
      
      // Create number buttons
      numberButtons = new JButton[10];
      for (int i = 0; i < 10; i++) {
         numberButtons[i] = new JButton(String.valueOf(i));
         numberButtons[i].addActionListener(new NumberListener());
      }
      
      // Add components to root panel
      rootPanel.add(new JLabel("Operand:"));
      rootPanel.add(operandTextField);
      rootPanel.add(new JLabel("Result:"));
      rootPanel.add(resultTextField);
      rootPanel.add(resetButton);
      rootPanel.add(clearButton);
      rootPanel.add(addButton);
      rootPanel.add(subtractButton);
      rootPanel.add(multiplyButton);
      rootPanel.add(divideButton);
      for (JButton b : numberButtons) {
         rootPanel.add(b);
      }
      
      // Set up frame
      this.add(rootPanel);
      this.setTitle("GUI Calculator");
      this.setSize(320, 200);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
   }
   
   private class ResetListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         result = 0.0;
         resultTextField.setText(String.valueOf(result));
      }
   }
   
   private class ClearListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         operandTextField.setText("");
      }
   }
   
   private class AddListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         result += Double.parseDouble(operandTextField.getText());
         resultTextField.setText(String.valueOf(result));
         operandTextField.setText("");
      }
   }
   
   private class SubtractListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         result -= Double.parseDouble(operandTextField.getText());
         resultTextField.setText(String.valueOf(result));
         operandTextField.setText("");
      }
   }
   
   private class MultiplyListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         result *= Double.parseDouble(operandTextField.getText());
         resultTextField.setText(String.valueOf(result));
         operandTextField.setText("");
      }
   }
   
   private class DivideListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         result /= Double.parseDouble(operandTextField.getText());
         resultTextField.setText(String.valueOf(result));
         operandTextField.setText("");
      }
   }
   
   private class NumberListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         operandTextField.setText(operandTextField.getText() + e.getActionCommand());
      }
   }
   
   public static void main(String[] args) {
      new CalculatorGUI();
   }
}