package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
	// First way
		char[]alphabets=new char[6];
		alphabets[0]='A';
		alphabets[1]='B';
		alphabets[2]='C';
		alphabets[3]='D';
		alphabets[4]='E';
		alphabets[5]='F';
		System.out.println(alphabets[1]);
	
	// second way
		char[] letter= {'A','B','C','D','E','F'};
		System.out.println(letter[1]);
		
		int size=letter.length;
		
		System.out.println("size of arrays= "+ size);
	}
}
