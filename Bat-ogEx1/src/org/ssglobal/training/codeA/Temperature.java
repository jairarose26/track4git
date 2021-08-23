package org.ssglobal.training.codeA;

public class Temperature {

	public static void main(String[] args) { 
		double tempf = 98.6; 
		double tempc = 0.0; 
		
		// Wrong: why capital! tempc = FtoC(tempf, tempc);
		tempc = ftoc(tempf, tempc); 
		System.out.println("Body temp in C is: " + tempc);		
	} 
	
	// Converts Fahrenheit temperatures to Celsius. 
	public static double ftoc(double tempf, double tempc) { 
		return tempc = (tempf - 32) * 5 / 9; 
	} 

}
