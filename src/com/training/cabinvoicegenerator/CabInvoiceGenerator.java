package com.training.cabinvoicegenerator;

import java.util.*;

public class CabInvoiceGenerator {
	
	public static ArrayList<FareCalculator> rideList=new ArrayList<FareCalculator>();	
	
	public static void takeRideInput() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter distance: ");		
		int distance=in.nextInt();
		System.out.println("Enter time: ");		
		int time=in.nextInt();
		rideList.add(new FareCalculator(distance,time));
	}
	
	public static void returnTotalFare()
	{
		int aggregateFare=0;
		for(FareCalculator fare: rideList)
		{
			aggregateFare+=fare.totalFare;
		}
		System.out.println("Aggregate Fare: " + aggregateFare);
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Ride Taken? (Y/N)");
		char check=in.next().charAt(0);
		while(check=='Y' || check=='y')
		{
			takeRideInput();
			System.out.println("Another Ride Taken? (Y/N)");
			check=in.next().charAt(0);	
		}
		returnTotalFare();
	}
}
