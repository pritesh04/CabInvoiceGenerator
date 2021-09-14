package com.bridgelab.cabinvoicegenerator;

public class CanInvoice {
	
	public static int distance_Per_Km=10;
	public static int rs_Per_Minute=5;
	public static int minFare=5;
	
	
	public double calculateFare(double distance , int time)
	{
		double totalFare= distance*distance_Per_Km + time*rs_Per_Minute;
		if((distance*distance_Per_Km)>minFare)
			return totalFare;
		return minFare;
	}

}
