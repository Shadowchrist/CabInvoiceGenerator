package com.training.cabinvoicegenerator;

public class FareCalculator {
	
	enum RideType
	{
		NORMAL,PREMIUM,EMPTY;
	}
	
	public int farePerDistance;
	public int farePerTime;
	public int minFare;
	public int distance;
	public int time;
	public int totalFare;
	
	public FareCalculator(RideType type,int distance, int time)
	{
		this.distance=distance;
		this.time=time;
		if(type==FareCalculator.RideType.EMPTY)
			totalFare=0;
		else if(type==FareCalculator.RideType.NORMAL)
		{
			this.farePerDistance=10;
			this.farePerTime=1;
			if(distance==0 && time==0)
				minFare=0;
			else
				minFare=5;
			totalFare=minFare+((farePerDistance*distance)+(farePerTime*time));
		}
		else if(type==FareCalculator.RideType.PREMIUM)
		{
			this.farePerDistance=15;
			this.farePerTime=2;
			if(distance==0 && time==0)
				minFare=0;
			else
				minFare=20;
			totalFare=minFare+((farePerDistance*distance)+(farePerTime*time));
		}
	}
}
