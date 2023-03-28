package Lesson2;
/*
* @author Musie M.
* ID: 616079
* 
* 			##################################
* 					Assignment Three
* 			##################################
* 
* Question 7: Declare an array of double of size 365 to store daily temperatures for one year. Using this data structure, 
* 			  write a code fragment to find the hottest and coldest days of the year.
* 
* 
*/

public class Question7 {
	
	public double[] hottestColdestDay(double[] temp) {
		double minTemp = temp[0];
		double maxTemp = temp[0];	
		
		// Creating an array to hold both the maximum and minimum temperature
		// in entire year.
		double[] maxMinTemp = new double[2];
		
		for(int i = 1; i < temp.length; i++) {
			
			if(temp[i] > maxTemp) {
				maxMinTemp[0] = temp[i];
			}
			if(temp[i] < minTemp) {
				maxMinTemp[1] = temp[i];
			}
			
		}
		
		return maxMinTemp; 
		
		
		
	}

}
