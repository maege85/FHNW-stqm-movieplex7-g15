package org.javaee7.movieplex7.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalesTest {
	
	private static final double DELTA = 1e-15;
	public Sales testSales;
	public Sales equalTestSales;
	public Integer id =1;
	public double amount = 16;
		
	@Test
	public void testHashCode() {
		testSales = new Sales(id);
		assertEquals(id.hashCode(), testSales.hashCode());
	}

	@Test
	public void testSales() {
		testSales = new Sales();
		assertNull(testSales.getId());
		assertEquals(0, testSales.getAmount(), DELTA);
	}

	@Test
	public void testSalesInteger() {
		testSales = new Sales(id);
		assertNotNull(testSales.getId());
		assertEquals(id, testSales.getId());	
		assertEquals(0, testSales.getAmount(), DELTA);
	}

	@Test
	public void testSalesIntegerDouble() {
		testSales = new Sales(id, amount);
		assertNotNull(testSales.getId());
		assertNotNull(testSales.getAmount());
		assertEquals(id, testSales.getId());
		assertEquals(amount, testSales.getAmount(), DELTA);
	}


	@Test
	public void testEqualsObject() {
		testSales = new Sales(id, amount);
		equalTestSales = testSales;
		assertTrue(testSales.equals(equalTestSales));
	}

}
