package com.training.cabinvoicegenerator;

public class FareCalculator {
	
	public final int farePerDistance=10;
	public final int farePerTime=1;
	public int minFare;
	public int distance;
	public int time;
	public int totalFare;
	
	public FareCalculator(int distance, int time)
	{
		this.distance=distance;
		this.time=time;
		if(distance==0 && time==0)
			minFare=0;
		else
			minFare=5;
		totalFare=minFare+farePerDistance*distance+farePerTime*time;
	}
}
