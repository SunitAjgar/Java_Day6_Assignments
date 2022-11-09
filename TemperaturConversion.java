package com.blz.day6;

import java.util.Scanner;

public class TemperaturConversion {
	
   public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in Farenheit");
    float faren = sc.nextInt();
    tempratureConvert(faren);
	}
	
	static void tempratureConvert(float faren) {
		
	float Celsius = (faren - 32) * 5/9;
	System.out.println("The temprature in Celsius is : "+Celsius);
	faren = (Celsius * 9/5) + 32;
	System.out.println("The temperature in Farenheit is : "+faren);

	}
}
