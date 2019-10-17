package com.xiongl;

import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class CalculationTest{
	
	@Test
	public void testAdd() {
		int a = 100;
		int b = 200;
		Assert.assertEquals(a + b, Calculation.add(a, b));
	}
	
	@Test
	public void testSub() {
		int a = 100;
		int b = 200;
		Assert.assertEquals(a - b, Calculation.sub(a, b));
	}
}
