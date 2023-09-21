package com.kh.junit.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;
	
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, arrp.getArray());
	}
	@Test
	public void testPractice2() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {0,1,2,3,4,5,6,7,8,9};
		assertEquals(expected, arrp.getArray());
	}
	@Test
	public void testPractice3() {
		int[] expected = {1,2,3};
		int[] actual = {0,1};
//		assertEquals(expexted, )
	}
}
