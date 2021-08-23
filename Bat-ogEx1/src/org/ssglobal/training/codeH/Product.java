package org.ssglobal.training.codeH;

public class Product {
	String productName;
	int numOfPcs = 0;
	
	void downLoad(int x) {
		this.numOfPcs = numOfPcs + x;
	}
	
	void upLoad(int x) {
		this.numOfPcs = numOfPcs - x;
	}
	
	String print() {
		return (productName + ", " + numOfPcs + " pieces");
	}
	
	
}
