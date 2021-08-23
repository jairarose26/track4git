package org.ssglobal.training.codes;


import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.ArgumentMatchers;

@ExtendWith(MockitoExtension.class)
public class TestFunList {
		
	@Mock
	private FunList mockedFulList;
	
	@Mock
	private List<String> arrayList;	
	
	
	@Test
	public void testProcessStr() {
		
		when( mockedFulList.processStr("str1", "str2")).thenReturn("str1 str2");
		
		// Act - SUT
		String result = mockedFulList.processStr("str1", "str2");
		Assertions.assertEquals("str1 str2", result);
	}
	
	@Test
	public void testRetrieveDataList() {
		
		when( arrayList.get( ArgumentMatchers.anyInt() ) ).thenReturn("Anna", "Lorna", "Fe");
		
		String result1 = arrayList.get(0);
		Assertions.assertEquals("Anna", result1);
		String result2 = arrayList.get(1);
		Assertions.assertEquals("Lorna", result2);
		String result3 = arrayList.get(2);
		Assertions.assertEquals("Fe", result3);	// Will stop at Fe
		String result4 = arrayList.get(3);
		Assertions.assertEquals("Fe", result4);
		String result5 = arrayList.get(4);
		Assertions.assertEquals("Fe", result5);
		
	}
	
	@Disabled
	@Test
	public void testRetrieveDataList2() {
		doReturn(100).when(arrayList.get( ArgumentMatchers.anyInt() ));
		
		Assertions.assertEquals( 100, arrayList.get(1) );
	}
	
	@Test
	public void testGetEmpty() {
		when( arrayList.get( ArgumentMatchers.anyInt() )).thenReturn("Anna");
		when( arrayList.isEmpty() ).thenReturn(false);
		
		Assertions.assertEquals(false, arrayList.isEmpty());
		Assertions.assertEquals("Anna", arrayList.get(20));
	}
	
	@Disabled
	@Test
	public void testShowLines() {		
		doNothing().when( mockedFulList ).showLines();
		
		//mockedFulList = new FunList("test/config/myfile.txt");
	}
	
	@Test
	public void testAddAnywhereWhateverStr() {
		
		doNothing().when(arrayList).add( ArgumentMatchers.anyInt(), ArgumentMatchers.isA(String.class) );
		
		arrayList.add(10, "Anna");
		verify(arrayList, times(2)).add(10, "Anna");
	}
}
