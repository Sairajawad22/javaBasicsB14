package com.syntax.class06;

import java.util.Scanner;

public class InhansClassTask1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//Enhance HW code:  Write a program for user 
		//to enter his/hers birth month.
		//Based on the month define the season.
		//Example: if user is born in March, April,
		//May → season =”Spring” 
		//if user is born in June, July, August → 
		//season =”Summer”  etc …
		//At the end of the program we should see 
				//1 output as “You were born is season __”.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please inter your birth month");
		String month=input.nextLine();
	    String season=null;

	    if (month.equals("January") ||month.equals("February") || month.equals("December")) {
	        season="Winter";
	    }else if(month.equals("March") || month.equals("April") ||month.equals("May")) {
	        season= "Spring";
	    }else if(month.equals("June") || month.equals("july") ||month.equals("August")) {
	        season="Summer";
	    }else if(month.equals("September") || month.equals("October") ||month.equals("November")) {
	        season="fall";

	    }else {
	        System.out.println("invalid");
	        
	        
	    }System.out.println(" You are born in " + season);


		
	}

}
