package com.syntax.class05;

import java.util.Scanner;

public class Class5HW1 {

	public static void main(String[] args) {
		// Based on the given time define:
		// if hour is between 1-11 --> Morning
		// if hour between 12-15 --> Afternoon
		// if hour between 16-20 --> Evening
		// if hour between 21-24 --> Night

		Scanner input = new Scanner(System.in);
		System.out.println("Please inter four times of the day");
		int hours = input.nextInt();
		if (hours >= 1 && hours <= 11) {
			System.out.println("It is morning");

		} else if (hours >= 12 && hours <= 15) {
			System.out.println("It is afternoon");

		} else if (hours >= 16 && hours <= 20) {

			System.out.println("It is evening ");
		} else if (hours >= 21 && hours <= 24) {
			System.out.println("It is night ");

		}
	}
}
