package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		String str =" i love java ";
		System.out.println(str);
        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         */
        System.out.println(str.trim());
        
        /*
         * startsWith =>check if a String starts with a specific letter or word
         * endsWith =>check if a String ends with a specific letter or word
         * contains  =>check if a String containss a specific letter or word
         */
        String str2="Java is Very easy";
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("y"));
        /*
         * Method chainging helps us call multiple method on a single line one 
         * method after an another
         */
        System.out.println(str2.toLowerCase().contains("very"));
     // contains method help us to search the letter word from the middle
        
        
       
	}

}
