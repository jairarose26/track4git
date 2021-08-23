package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestGradeBook {

	private GradeBook<Double> gb;
	
	@BeforeEach
	public void setup() {
		gb = new GradeBook<Double>();
	}
	
	/* Sunny Day Testing */
	
	@ParameterizedTest
	@ValueSource(doubles = {95.5, 90.5, 70.5, 50.6, 68.6})
	public void testAddFiveGrades(double testData) {
		//gb.addGrade(testData);
		//gb.printGrades();
	}
	
	@AfterEach
	public void teardown() {
		System.out.println("Destroyer\n");
	}
}
