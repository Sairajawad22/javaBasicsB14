package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[]word= new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day.";
		word[3]="coding";
		word[4]="is";
		System.out.println(word[1]+" "+ word[4]+" "+ word[0]+" "+ word[3]+" "+ word[2]);
		
		
		
		System.out.println("**************************************************");
		
		String[]words= {"Java","Saturday","day.","coding","is"}; 
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]+ " ");
		}
		
			}

	
}

