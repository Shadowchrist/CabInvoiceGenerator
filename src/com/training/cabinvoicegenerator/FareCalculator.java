package com.training.cabinvoicegenerator;

public class FareCalculator {
	
	public final int farePerDistance=10;
	public final int farePerTime=1;
	public final int minFare=5;
	public int distance;
	public int time;
	public int totalFare;
	
	public FareCalculator(int distance, int time)
	{
		this.distance=distance;
		this.time=time;
		totalFare=minFare+farePerDistance*distance+farePerTime*time;
	}
}
