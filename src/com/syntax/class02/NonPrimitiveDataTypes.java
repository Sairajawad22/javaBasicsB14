package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// String is just 1 example of non primitive data tyoe
		
		String name="Asma";
		String adress="123 adress street";
		int phone =1234567890;
		String age="7";// anything you put inside the double "" ->becomes string
		
		int age1=18;
		// ctr+space->auto complete the statment
		// syso +ctrl =space
		System.out.println(name);
		// "My name is" +Asma   when we connect two string we just put + sign 
		System.out.println("My name is "+ name);
		// Asma is 17
		System.out.println(name + " is " +age1); 
		 String fruit ="apple";
		 double price=1.99;
		 // the price of the apple is 1.99
		 
		 fruit= "mango";
		 price= 5.99;
		 System.out.println( "The price of the " +fruit+" is "+ price );
	   /* to attach any value ( int, double, boolean, char, String, etc)
	    * to a string we use + 
	    * 
	    * + next to the String acts as Concatenation 
	    */
		
		

	}

}
