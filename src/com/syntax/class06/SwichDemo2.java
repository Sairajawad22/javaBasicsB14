package com.syntax.class06;

import java.util.Scanner;

public class SwichDemo2 {

	public static void main(String[] args) {
		
		/*
		 * we need to ask the user where he?she is from
		 * 
		 * based on the country -> define favorite food
		 * 
		 * 
		 */
		
    Scanner in= new Scanner(System.in);
    System.out.println("Please tell me where are you from?");
    String country=in. nextLine();
    String favoriteFood;
    
    switch (country) {
    
    case "USA":
    	favoriteFood="burger and fries";
    	break;
    
    case "Kazakhstan":
    	favoriteFood="beshparmak";
    	break;
    	
    case "Turkey":
    	favoriteFood="adana kabob";
    	break;
    	
    case "India":
    	favoriteFood="chekin curry";
    	break;
    	default:
    		favoriteFood="unknown";
        	break;	
    	
    }
System.out.println("you are from " +country+ "and your favorite food is" + favoriteFood );
	}

}
