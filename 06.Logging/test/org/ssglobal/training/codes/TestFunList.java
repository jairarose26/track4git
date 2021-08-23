package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFunList {

	private FunList funlist;
	
	@BeforeEach
	public void setup() {
		funlist = new FunList("test/config/myfile.txt");
	}
	
	@Test
	public void test () {
		funlist.enableDisplay();
	}

	@AfterEach
	public void teardown() {
		funlist = null;
	}
	
}
