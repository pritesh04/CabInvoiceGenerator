package com.bridgelab.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CanInvoice {

	public static int distance_Per_Km = 10;
	public static int rs_Per_Minute = 5;
	public static int minFare = 5;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public double calculateFare(double distance, int time) {
		int i = 0;

		double totalFare = distance * distance_Per_Km + time * rs_Per_Minute;
		if ((distance * distance_Per_Km) > minFare)
			return totalFare;
		map.put(i, (int) totalFare);
		map.put(i, minFare);
		i++;
		return minFare;
	}

	public double calculateAverageFare(Ride[] ride) {
		double averageFare = 0;
		for (Ride ride2 : ride) {
			averageFare = averageFare + this.calculateFare(ride2.distance, ride2.time);
		}
		return averageFare;

	}



}
