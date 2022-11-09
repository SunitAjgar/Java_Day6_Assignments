package com.blz.day6;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Month");
		int month = sc.nextInt();

		System.out.println("Enter the Day");
		int day = sc.nextInt();

		System.out.println("Enter the Year");
		int year = sc.nextInt();

		dayOfWeek(year, day, month);
	}


	static void dayOfWeek(int year, int day, int month) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;

		switch (d0) {
		case 1:
			System.out.println("The day of the week is Monday");
			break;
		case 2:
			System.out.println("The day of the week is Tuesday");
			break;
		case 3:
			System.out.println("The day of the week is Wednesday");
			break;
		case 4:
			System.out.println("The day of the week is Thursday");
			break;
		case 5:
			System.out.println("The day of the week is Friday");
			break;
		case 6:
			System.out.println("The day of the week is Saturday");
			break;
		case 0:
			System.out.println("The day of the week is Sunday");

		}
	}
}
