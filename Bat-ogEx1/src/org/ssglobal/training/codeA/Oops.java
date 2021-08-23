package org.ssglobal.training.codeA;

public class Oops {

	public static void main(String[] args) {
		int a = 7, b = 42; 
		int smaller = minimum(a, b); 
		
		if (smaller == a) { 
			System.out.println("a is the smallest!"); 
		}
	}
		
	public static int minimum(int a, int b) {  
		// Returns which INT is smaller 
		int smaller = 0;
		
		if (a < b) {
			smaller = a; 
		} else if (a >= b) {
			smaller = b; 
		} 
		
		return smaller; 
	}
}

