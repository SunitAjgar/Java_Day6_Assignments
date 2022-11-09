package com.blz.day6;

import java.util.Scanner;

public class MonthlyPayment
{
	public static void main(String arg[])
	{
	    Scanner scan = new Scanner(System.in); 
      	System.out.print("Enter Principal Amount : ");
      	double principal = scan.nextDouble(); 
      	System.out.print("Enter Rate of Interest : ");
      	double rate = scan.nextDouble(); 
      	System.out.print("Enter Time period in years : ");
      	int time = scan.nextInt();
      	calculatePayment(principal, rate, time);
 	}
	
	static void calculatePayment(double principal, double rate, int time) {
		rate =( rate/100)/12;
		time = time * 12;
		double monthly = (principal * rate) / (1 - Math.pow(1 + rate, -time));
		System.out.println("The monthly payment to be paid is :  " +monthly);
	}
}
