package com.bridgelab.cabinvoicetest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.cabinvoicegenerator.CabType;
import com.bridgelab.cabinvoicegenerator.CanInvoice;
import com.bridgelab.cabinvoicegenerator.InVoiceGenerator;
import com.bridgelab.cabinvoicegenerator.Ride;

public class CabInvoiceGeneratorTest {

	@Test
	public void givenDistanceTime_SHouldReturn_TotalFare() {
		CanInvoice canInvoice = new CanInvoice();
		double rate = canInvoice.calculateFare(10, 5,CabType.REGULAR);
		Assert.assertEquals(160, rate, 0.0);
	}

	@Test
	public void givenDistanceTime_SHouldReturn_MinFare() {
		CanInvoice canInvoice = new CanInvoice();
		double rate = canInvoice.calculateFare(0.2, 5,CabType.REGULAR);
		Assert.assertEquals(5.0, rate, 0.0);
	}

	@Test
	public void givenDistanceTime_SHouldReturn_AverageFare() {
		CanInvoice canInvoice = new CanInvoice();
		Ride[] ride = { new Ride(2, 5), new Ride(0.1, 1) };
		InVoiceGenerator summary = canInvoice.calculateAverageFare(ride,CabType.REGULAR);
		InVoiceGenerator expected = new InVoiceGenerator(2, 45);
		Assert.assertEquals(summary, expected);
	}

	@Test
	public void showDeatils() {
		CanInvoice canInvoice = new CanInvoice();
		Ride[] ride = { new Ride(2, 5), new Ride(0.1, 1) };
		InVoiceGenerator summary = canInvoice.calculateAverageFare(ride,CabType.PREMIUM);
		canInvoice.showDetails();
	}
}
