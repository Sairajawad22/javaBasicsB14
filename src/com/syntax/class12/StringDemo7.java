package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		 String str="I am always consfused i was kidding";

	        System.out.println(str.indexOf("a"));// this method help us to find from which 
	        System.out.println(str.indexOf("s"));// index first the letter has started
	        System.out.println(str.indexOf(" "));// gives the index of the space
	        /*
	         * substring() gives you smaller string from a String we can start the starting
	         * part to this method and it will return us the subString from that index
	         */
	        System.out.println(str.substring(5));// substring method can help us to get specific

	        System.out.println(str.substring(5,11));// part of the string


	    }	

	}


