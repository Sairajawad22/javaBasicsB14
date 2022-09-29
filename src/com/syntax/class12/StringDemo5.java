package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub

        String str="I love java programming";
        /*
         * charAt returns us the character at a specific index
         */
        System.out.println(str.charAt(3));

        for(int i=0; i<str.length();i++) {// in this loop we find the length
            //print only the characters not spaces
            if(!(str.charAt(i)==' ')) {// we say it the if their is space ignore it and  don't print and only print the letter 
                System.out.print(str.charAt(i));
            }

        }
	
	}

}