package com.kh.testSample;

import static org.junit.Assert.assertEquals;
	// = import static org.junit.Assert.*s;
import org.junit.Test;

public class CalculatorTset {

	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(3, 4);
		assertEquals(7, result); //예상값과 실제 결과값 비교
	}
	@Test
	public void testSubtraction() {
		Calculator cal = new Calculator();
		int result = cal.subtract(10, 5);
		assertEquals(5, result);
	}
	

}
