package com.syntax.class04;

import java.util.Scanner;

public class Class4Hw7 {

	public static void main(String[] args) {
// Write a program to ask user to enter numbers of worked years
//and annual salary. If user worked for more or equals to 5 years 
//than user is eligible for the bonus, otherwise he is not. Once user is
//	eligible and salary is larger than 50000 than bonus
//	= 5000, otherwise bonus=3000.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter numbers of worked years");
		int numbOfWork= scanner. nextInt();
		
		if(numbOfWork>=5) {
			System.out.println("You are eligible for bonus");
		
		System.out.println("What is your curent salary?");
		double salary= scanner.nextDouble();
		if(salary>50000) {
			
			System.out.println("You are eligible for 5000 bonus");
		}
		else {
			System.out.println("You are eligible for3000 bonus");
			
		}
		}else {
			System.out.println("Sorry you are not eligible for any bonus");
			
		}
	}
	

}
