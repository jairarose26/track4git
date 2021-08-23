/* (1) ERROR:	No package declaration */
package org.ssglobal.training.codeI;

public class FahrenheitToCelsiusx {
	public static void main( String [] args ) { 
		// declare and initialize data 
		
		/* (2-3) Type mismatch: cannot convert from double to float, 
		 * and (4-5) Variable was not used (cannot be resolved to a variable) 
		 * float Celsius = 35.5; 
		 * float Fahrenheit = 22.6; 
		 * (6) celsius value is not needed */
		double celsius; 
		double fahrenheit = 22.6;
		
		// calculate celsius equivalent 
		
		/* (7) Duplicate declaration: double celsius,
		 * (8) Logic Error: 5/9 * fahrenheit - 32 */
		celsius = (fahrenheit - 32) * 5/9; 
		
		// output results 
		
		/* (9) ERROR: Invalid escape sequence 
		 * System.out.println( fahrenheit, "\U00B0F = " );  
		 * and (10) U00B0F is supposed to display as U00b0F
		 * and (11) PrintStream is not applicable for the arguments */
		
		// System.out.println( fahrenheit +  " \\U00b0F = " ); 
		System.out.println( fahrenheit +  " \u00b0F = " ); 
		
		/* (12) Wrong variable: celcius 
		 * and (13) PrintStream is not applicable for the arguments*/
		// System.out.println( celsius + "u00B0C" );
		System.out.println( celsius + "\u00B0C" ); 
	} 

}
