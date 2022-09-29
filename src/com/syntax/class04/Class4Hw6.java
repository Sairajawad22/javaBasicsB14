package com.syntax.class04;

import java.util.Scanner;

public class Class4Hw6 {

	public static void main(String[] args) {
//Create a Java program that will ask if user has a credit card
//or not. If you user does not have a credit card then offer them. 
//If they do have one ask what is balance on the card? 
//If balance of the card is larger than 1000, tell them to pay off
//immediately, otherwise you can tell them that they can spend more.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a cridet card?");
		boolean hasCridetCard= scanner.nextBoolean();
		
		if(hasCridetCard){
		System.out.println("what is balance on the card?");	
		double sccore= scanner.nextDouble();
		
		if (sccore>1000) {
			System.out.println("Pay of immediatly");	
		}else {
			System.out.println("You can spend more");
			
			
		}
		}else {
		System.out.println("would you like to apply one?");

	}
	}
}
