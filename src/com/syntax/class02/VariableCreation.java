package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		
		//1 First way to create a variable
		byte b=10;
		
		// 2Another way how to createa variable
		int i // creat variable (box name is i)
		=100; // assign value ( we already created box i, we are not creating another box)
		// we need to create  variable only once then we can use as many times we need 
		
		//3 way is very
		
		int num1, num2, num3; // we are creating a variable 
		
		num1=100; // Assign value or initialize variable
		num2=200; // assign the value
		num3=300;
			// int num1=100; error duplicate variable 
		System.out.println(num2);
		// ? can i change a value of a variable???
		num2=2000; //reassign the value
		System.out.println(num2);
		// one variable can hold only value at one time/ per line 
		
		

	}

}
