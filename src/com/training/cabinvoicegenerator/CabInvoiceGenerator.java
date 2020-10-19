package com.training.cabinvoicegenerator;

import java.util.*;

public class CabInvoiceGenerator {
		
	public static HashMap<String,SingleUserFareCalculator> userRideList=new HashMap<String,SingleUserFareCalculator>();
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter User ID: ");
		String userID=in.nextLine();
		System.out.println("Welcome User.");
		if(!userRideList.containsKey(userID))
			userRideList.put(userID, new SingleUserFareCalculator());
		SingleUserFareCalculator userDetail = userRideList.get(userID);
		System.out.println("Ride Taken? (1 for Normal Rides/2 for Premium Rides)");
		int check=in.nextInt();
		while(check==1 || check==2)
		{
			if(check==1)
				userDetail.takeRideInput(FareCalculator.RideType.NORMAL,userID,userDetail);
			else if(check==2)
				userDetail.takeRideInput(FareCalculator.RideType.PREMIUM,userID,userDetail);
			System.out.println("Another Ride Taken? (1 for Normal Rides/2 for Premium Rides/3 to calculate Fare)");
			check=in.nextInt();	
		}
		userDetail.generateInvoice(userID,userDetail);
	}
}
