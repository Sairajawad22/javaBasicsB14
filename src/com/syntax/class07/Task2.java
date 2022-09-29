package com.syntax.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		  //create a secret number and let user guess the secrete number
		  // once user guessed your secrete number -->program says you won! 
		 int secreteNumber= 22;
		 int userAnswer;
		 
		 Scanner in= new Scanner(System.in);
	         
	        do {
	        	System.out.println("Please guess the secrete number");
	        	userAnswer= in.nextInt();
	        
	}while(userAnswer!= secreteNumber);
		System.out.println("Congratulation you won!");
	}

}
