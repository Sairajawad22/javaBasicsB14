package com.syntax.class04;

import java.util.Scanner;

public class Class4Part1Hw {

	public static void main(String[] args) {
		// Write a program to store a boolean value of whether user 
		//has diploma or not. If user has a diploma, you should say 
		//congratulations, otherwise program should suggest to get a degree.
		//Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → output should say 
		//“You are eligible for scholarship”, otherwise → 
		//“You should have studied harder” .
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have diplom ? Type true or false: " );
		boolean userHasDiploma= scanner.nextBoolean();
		
		if(userHasDiploma) {
			System.out.println("Congratulations! " );
			System.out.println("what is your GPA score? " );
			double gpaScore= scanner.nextDouble();
			
			if(gpaScore>=3.5) {
				System.out.println(" You are eligible for scholarship " );	
			}else {
				System.out.println(" You should have studied harder " );	
			}
			
		}else {
			System.out.println(" you should get a degree" );
		}
		
	}

}
