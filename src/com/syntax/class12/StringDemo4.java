package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		 String str="Shah";// the reason why we cannot use == or other relative operators sign for string because str is
	        String str2="Shah";// a class and non primative data types and non primative has method to use
	        String str3=new String("Shah");

	        if(str.equals("shah")) {
	            System.out.println("I found it");
	        }
	        /*
	         * equals checks if two Strings are exactly the same with exact same case
	         * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the
	         * case of letters
	         */
	        if(str.equalsIgnoreCase("shah")) {
	            System.out.println("I found it with equalsIgnoreCase");
	        }

	}

}
