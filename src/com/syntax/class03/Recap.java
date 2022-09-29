package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concatenation helps us combine a string with any primitive data together 
		 *
		 */
		String frstName="Saira";
		String lastName="Jawad";
		String fulltName= frstName+"  "+lastName;
		System.out.println(fulltName);
		
		int houseNO=15;
		int apartmentNo=5;
		String streetNo="That street";
		String city= "NewYodrk";
		String fullAddress="USA";
		
		String incompleteAdress=houseNO+city;
		String step1= "if substract 10 from 5 we get =" + 10; // Results in a string 
		System.out.println(step1);
		// its is not defined. java does not understand what to do when we ask her to subtract 
		// a String from sa number it complains
		
		System.out.println("if we substract 10 from 5 we get=" +(10-5));
		
				
		
 
	}

}
