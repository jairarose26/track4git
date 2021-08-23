package org.ssglobal.training.codes;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestDivide {

	@Mock
	private Divide divide;
	
	@InjectMocks
	private Mathematics math;
	
	@Test
	public void testComplex() {
		
		when(divide.div(anyInt(), isA(Integer.class))).thenReturn(1);
		
		double result = math.complexOp(10, 10);
		Assertions.assertEquals(1999.0, result);
		
		verify(divide, times(2)).div(10, 10);
	}
	
}
