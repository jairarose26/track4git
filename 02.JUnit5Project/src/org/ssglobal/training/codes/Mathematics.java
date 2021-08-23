package org.ssglobal.training.codes;

public class Mathematics {

	public int divide(int x , int y) throws ArithmeticException, Exception {
		if (y == 0 ) {
			throw new ArithmeticException("Divide by Zero Error");
		} else {
			return x / y;
		}
	}
}
