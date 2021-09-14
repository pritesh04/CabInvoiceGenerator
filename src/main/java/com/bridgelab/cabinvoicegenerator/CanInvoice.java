package com.bridgelab.cabinvoicegenerator;

public class CanInvoice {
	
	public static int distance_Per_Km=10;
	public static int rs_Per_Minute=5;
	
	public double calculateFare(int distance , int time)
	{
		int totalFare= distance*distance_Per_Km + time*rs_Per_Minute;
		return totalFare;
	}

}
