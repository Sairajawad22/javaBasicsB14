package com.syntax.class07;

import java.util.Scanner;

public class Hwork5 {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask the user to pay for a coffee.
		 *  Keep asking to pay for coffee until the user enters the EXACT amount . 
		 *  If the user gives more than coffee price --> ask them to give less, if the user gives 
		 *  less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
		 * 
		 */
		
		double coffeePrice=4.5;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for the coffee");
		double price = scan.nextDouble();
		
		if(price>4.5) {
			System.out.println("Please give less");
		}else if(price<4.5) {
			System.out.println("Please give more");	
			
			}while(price==4.5) {
				System.out.println("Please enjoy your coffee");		
				price++;
			}
		}
				

	}


