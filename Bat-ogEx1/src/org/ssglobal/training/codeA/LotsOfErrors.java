package org.ssglobal.training.codeA;

public class LotsOfErrors {

	public static void main(String[] args) { 
		System.out.println("Hello, world!"); 
		
		// Wrong: Message();		
		message();
		
	} 
	
	public static void message() { 
		System.out.println("This program surely cannot"); 
		// Wrong: System.out.println("have any so-called errors in it");
		System.out.println("have any so-called \"errors\" in it");
		
		// Semantic because its one statement
		
	}

}
