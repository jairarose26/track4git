package org.ssglobal.training.codeF;

public class AssignMe {

	public static void main(String[] args) {
		int x = 3;
		int y = x * 2;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println ("The value of x is " + x);
		System.out.println ("The value of y is " + y);
	}

}
