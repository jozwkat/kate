package com.test;

import org.junit.Test;

import junit.framework.Assert;

public class TestTest {

	TestApp testApp = new TestApp(); 
	
	@Test
	public void testCalc() {
		
		int result = testApp.calcualte(0, 1);
		
		Assert.assertEquals(0, result);
		
	}
	@Test
	public void testCalc1() {
		
		int result = testApp.calcualte(1, 1);
		
		Assert.assertEquals(1, result);
		
	}
	
	@Test
	public void testCalc2() {
		
		int result = testApp.calcualte(2, 1);
		
		Assert.assertEquals(0, result);
		
	}
	
	@Test
	public void test() {
		
		TestApp test2 = null;
		int result = testApp.calcualte(4,2);
		Assert.assertNotNull(test2);
		Assert.assertEquals(18, result);
	}
	
}
