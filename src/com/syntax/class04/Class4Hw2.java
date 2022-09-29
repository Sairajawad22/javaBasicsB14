package com.syntax.class04;

import java.util.Scanner;

public class Class4Hw2 {

	public static void main(String[] args) {
	//Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, 
		//otherwise user will consider buying. Once user decides to buy a house, if price of the house is larger
		//than 200000 than user will take a loan, otherwise user will pay cash	
		
		Scanner scanner=new Scanner(System.in);
      System.out.println("What is the current mortgage rate");
      double morgageRate=scanner.nextDouble();
      
      if(morgageRate<4.5) {
    	  System.out.println("You should consider buying a house. How much is it?");
    	  double house=scanner.nextDouble();
    	  
      if (house>200000) {
    	  System.out.println("You should get a loan"); 
    	  
      }else {
    	  System.out.println("You should pay cash");   
    	  
      }
      
	}else {
		 System.out.println("You should not a buy a house now"); 
	}
	}

}
