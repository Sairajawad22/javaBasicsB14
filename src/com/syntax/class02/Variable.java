package com.syntax.class02;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Saira";
		String lastName = "Jawad";
		String grade = "A";
		String city= "Brambleton";
		String state = "Virginia";
		String phone = "7637897389373";
		
		System.out.println( "My name is "+ name+ " and my last name is " +lastName);
		
		System.out.println( " I am " +grade+"student");
		System.out.println("I live in "+city+ " and state is "+ state);
		System.out.println("And my phone number is "+phone);
      // change 
		
		 grade = "B";
		 city= "Falls charch"; // reassigning 
		 state = "CA";
		 phone = "765746675786876";
		
			System.out.println("I live in "+city+ " and state is "+ state);
			System.out.println("And my phone number is "+phone);
		//Rules for Indentifiers=names (variables, method,class)
			//1. cannot use keyword as identefiers 
			// Stringe new = "Hello";-> error
			
			// 2 cannot have space in identifiers 
			//String last name= "Smith";
			
			// 3 identefiers cannot start with number
			// identifiers=123;
			int number =123; //number can be anywhere after 1 charachter 
			/*
			 * 4.identefiers cannot contain any special charachter 
			 * boolean hello!=true; 
			 * exept $ or _
			 * char #chara='A';
			 */
			double $price =9.98; 
			float _price =1.99f;
			/*
			 * Name and Conventions 
			 * 
			 * Class should start with uppercase and follow by  camelcasing 
			 * 
			 * varaible should start with lowercase and follow camellcase
			 */
			String Weather= "hot";
			String myWeather = "cold";
	}

}
