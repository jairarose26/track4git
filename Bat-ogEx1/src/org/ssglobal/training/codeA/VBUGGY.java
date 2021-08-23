package org.ssglobal.training.codeA;

public class VBUGGY {
	
	// Its okiee to user param[]
	public static void main(String[] args) { 
		String name; 
		
		// Wrong, erase the comment: Int value; 
		int value = 0;
		
		/* Wrong, delete this: 
		Output 	out 	= new Output(); 
		Input 	input	= new Input(); 
		*/
		
		System.out.println("Hello. Please type your name: "); 
		// Wrong, hard code: name = input.readln(); 
		name = "Maria";
		
		System.out.println("Now type a whole number: "); 
		// Wrong, hard code: int value = input.readint(); 
		value = 50;
		
		// Wrong, hard code
		System.out.println("The square of your number is " + (value*value) ); 
		// out.close(); 
	} 

}

class Output {

	public void writeln(String string) {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

class Input {

	public String readln() {
		// TODO Auto-generated method stub
		return null;
	}

	public int readint() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}