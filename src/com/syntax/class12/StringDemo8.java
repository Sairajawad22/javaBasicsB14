package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		
		//replace method replacing one string with another in a string 
		
        System.out.println(str.replace("good", "Excellent"));
        
     // replaceAll it takes a pattren and replace all the characters that follow the 
        
        System.out.println(str.replaceAll("[a-z]", ""));	
	}

}
