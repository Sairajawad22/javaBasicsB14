package com.syntax.class05;

import java.util.Scanner;

public class Class5HW2 {

	public static void main(String[] args) {
//  Write a program for user to enter his/hers birth month.
//Based on the month define the season.
 //Example: if user is born in March, April, May → season =”Spring” 
//if user is born in June, July, August →season =”Summer”  etc …
		Scanner input = new Scanner(System.in);
		System.out.println("Please inter your birth month");
		String month=input.nextLine();
		if(month.equals("March")||month.equals("April")||month.equals("May")){
			System.out.println("It is Spring");
			
		}else if (month.equals("June")||month.equals("July")||month.equals("Agust")) {
			
			System.out.println("It is Summer");
			
		}

	}

}
