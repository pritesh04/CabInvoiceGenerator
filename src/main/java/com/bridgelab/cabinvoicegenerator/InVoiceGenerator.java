package com.bridgelab.cabinvoicegenerator;

public class InVoiceGenerator {
	public int noOfRides;
	public double totalFare;
	public double averageFare;

	public InVoiceGenerator(int noOfRides, double totalFare) {
		super();
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = noOfRides / totalFare;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InVoiceGenerator other = (InVoiceGenerator) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (noOfRides != other.noOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InVoiceGenerator [noOfRides=" + noOfRides + ", totalFare=" + totalFare + "]";
	}
	
	

}
