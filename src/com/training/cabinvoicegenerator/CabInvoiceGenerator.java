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
		System.out.println("Ride Taken? (Y/N)");
		char check=in.next().charAt(0);
		while(check=='Y' || check=='y')
		{
			userDetail.takeRideInput(userID,userDetail);
			System.out.println("Another Ride Taken? (Y/N)");
			check=in.next().charAt(0);	
		}
		userDetail.generateInvoice(userID,userDetail);
	}
}
