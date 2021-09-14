package com.bridgelab.cabinvoicetest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.cabinvoicegenerator.CanInvoice;


public class CabInvoiceGeneratorTest {

	@Test
	public void givenDistanceTime_SHouldReturn_TotalFare()
	{
		CanInvoice canInvoice= new CanInvoice();
		double rate=canInvoice.calculateFare(10, 5);
		Assert.assertEquals(125, rate,0.0);
	}
}
