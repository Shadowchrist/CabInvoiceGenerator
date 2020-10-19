package com.training.cabinvoicegenerator;

import java.util.Scanner;

public class FareCalculator {
	
	public static final int farePerDistance=10;
	public static final int farePerTime=1;
	public static final int minFare=5;
	public static void main(String args[])
	{
		int totalFare=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter distance: ");		
		int distance=in.nextInt();
		System.out.println("Enter time: ");		
		int time=in.nextInt();
		totalFare=minFare+farePerDistance*distance+farePerTime*time;
		System.out.println("Total Fare: " + totalFare);
	}
}
