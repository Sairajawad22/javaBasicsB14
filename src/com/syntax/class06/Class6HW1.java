package com.syntax.class06;

import java.util.Scanner;

public class Class6HW1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks.
		
		Scanner in= new Scanner(System.in);
	    System.out.println("Please enter your country");
	    String country=in. nextLine();
	    String language;
	    
	    switch(country) {
	    case "Afghanistan":
	    	language= "Pashto";
	    break;
	    
	    case "Pakistan":
	    	language= "Urdo";
	    break;
	    
	    case "Usa":
	    	language= "English";
	    break;
	    
	    case "Iraq":
	    	language= "Arabic";
	    break;
	    case "Iran":
	    	language= "Persion";
	    break;
	    
	    default:
	    	language= "Unknown";
	    
	    }
	    
	   System.out.println("You are from " + country + " and your speak " + language); 
	    

	}

}
