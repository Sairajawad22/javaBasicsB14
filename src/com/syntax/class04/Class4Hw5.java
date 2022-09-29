package com.syntax.class04;

import java.util.Scanner;

public class Class4Hw5 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print 
		//“The temperature is the city  is 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Where do you live?");
		String city= scanner.nextLine();
		
		System.out.println("What is temperature there?");
		int temp=scanner.nextInt();
		int tempF= (temp-32)*5/9;
		System.out.println("The temperature in " + city + " is "+ tempF);
	}

}
