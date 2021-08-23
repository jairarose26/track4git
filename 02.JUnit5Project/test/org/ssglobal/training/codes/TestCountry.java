package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.ssglobal.training.codes.Country.Choice;

public class TestCountry {

private Country cnt;
	
	@BeforeEach
	public void setup() {
		System.out.println("Initialization");
		cnt = new Country();
	}
	
	/* Sunny Day Testing */
	
	@ParameterizedTest
	@EnumSource (value = Country.Choice.class)
	public void testGrettPerCountry (Country.Choice option) {
		String result = cnt.sayGreet(option);
		Assertions.assertNotNull(result);
	}
	
	/* Rainy Day Testing */
	
	@ParameterizedTest
	@EnumSource (value = Country.Choice.class)
	public void testGrettPerCountryNotChoice (Choice option) {
		String result = cnt.sayGreet(option);
		Assertions.assertNull(result);
	}
	
	@AfterEach
	public void teardown() {
		cnt = null;
		System.out.println("Destroyer\n");
	}
	
	// private enum NotChoice { MOR, AFG, CHN, TUR }
	
}
