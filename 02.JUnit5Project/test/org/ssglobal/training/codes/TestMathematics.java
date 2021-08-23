package org.ssglobal.training.codes;


import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TestMathematics {

	private Mathematics math;
	
	@BeforeEach
	public void setup() {
		math = new Mathematics();
	}
	
	/* Sunny Day */
	
	@ParameterizedTest
	@MethodSource(value = {"mathProvider1"})
	public void testDivide (int[] testdata) {
		Assertions.assertDoesNotThrow( () -> {
			int result = math.divide(testdata[0], testdata[1]);
			Assertions.assertEquals(testdata[2], result);
		});
	}
	
	/* Rainy Day */
	
	@ParameterizedTest
	@MethodSource(value = {"mathProvider2"})
	public void testDivideIncorrectData (int[] testdata) {
		Assertions.assertThrows( ArithmeticException.class, () -> {
			int result = math.divide(testdata[0], testdata[1]);
			Assertions.assertNotEquals(testdata[2], result);
		});
	}
	
	@AfterEach
	public void teardown() {
		math = null;
	}
	
	/* Custom Test Data */
	private static Stream<int[]> mathProvider1() {
		return Stream.of(new int[] {1, 2, 0}, 
						 new int[] {10, 2, 5}, 
						 new int[] {5, 2, 2});
	}
	
	private static Stream<int[]> mathProvider2() {
		return Stream.of(new int[] {1, 2, 1}, 
						 new int[] {5, 0, 0}, 
						 new int[] {10, 2, 2});
	}
}
