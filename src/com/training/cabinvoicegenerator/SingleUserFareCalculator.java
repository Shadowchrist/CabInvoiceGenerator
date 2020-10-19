package com.training.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleUserFareCalculator {

	public ArrayList<FareCalculator> rideList=new ArrayList<FareCalculator>();
	
	public SingleUserFareCalculator()
	{
		rideList.add(new FareCalculator(0,0));
	}
	
	public void takeRideInput(String userID, SingleUserFareCalculator userDetail) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter distance: ");		
		int distance=in.nextInt();
		System.out.println("Enter time: ");		
		int time=in.nextInt();
		userDetail.rideList.add(new FareCalculator(distance,time));
	}
	
	public void generateInvoice(String userID, SingleUserFareCalculator userDetail)
	{
		int aggregateFare=0;
		for(FareCalculator fare: userDetail.rideList)
		{
			aggregateFare+=fare.totalFare;
		}
		System.out.println("User ID: " + userID);
		System.out.println("Number of Rides taken: " + (userDetail.rideList.size()-1));
		System.out.println("Aggregate Fare: " + aggregateFare);
		System.out.println("Average Fare: " + (double)(aggregateFare/(userDetail.rideList.size()-1)));
	}
}
