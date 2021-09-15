package com.bridgelab.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.K;

public class CanInvoice<V> {

	public static int distance_Per_Km = 10;
	public static int rs_Per_Minute = 5;
	public static int minFare = 5;
	private final static int distance_PerKmForPremium = 15;
	private final static int rsPerMinuteForPremium = 2;
	private final static int minFareForPremium = 20;

	public double calculateFare(double distance, int time, CabType cabType) {
		int i = 0;
		if (cabType.equals("REGULAR"))

		{
			double totalFare = distance * distance_Per_Km + time * rs_Per_Minute;
			if ((distance * distance_Per_Km) > minFare)
				return totalFare;
		} else {

			double totalFare = distance * distance_PerKmForPremium + time * rsPerMinuteForPremium;
			if ((distance * distance_PerKmForPremium) > minFare)
				return totalFare;
		}

		i++;
		return minFare;
	}

	Map<Integer, Double> map = new HashMap<Integer, Double>();

	public InVoiceGenerator calculateAverageFare(Ride[] ride, CabType cabType) {
		double averageFare = 0;
		Integer i = 0;
		for (Ride ride2 : ride) {
			averageFare = averageFare + this.calculateFare(ride2.distance, ride2.time,cabType);
			map.put(i, this.calculateFare(ride2.distance, ride2.time,cabType));
			++i;
		}
		return new InVoiceGenerator(ride.length, averageFare);

	}

	public void showDetails() {

		for (Entry<Integer, Double> k : map.entrySet()) {
			System.out.println("Id is " + k.getKey() + " Average Fare is  " + k.getValue() );
		}

	}

}
