package com.syntax.class06;

import java.util.Scanner;

public class Class6Hw3 {

	public static void main(String[] args) {
 // Using scanner class create calculator. Allow user to enter
//2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
//Please complete this assignment in 2 ways: using if statement and switch case.
		
		// First part of question#3(if else if condition)
		Scanner scan=new Scanner(System.in);
		System.out.println("Please intere the first name ");
		int num1=scan.nextInt();
		System.out.println("Please intere the second name ");
		int num2=scan.nextInt();
		System.out.println("Please choose the operation");
		char operation=scan.next().charAt(0);
		int sum=num1+num2;
		int sub=num1-num2;
		int multipication=num1*num2;
		double div=num1/num2;
		
		if (operation== +'+') {
			System.out.println("sum");
			
		}else if(operation== +'-') {
			System.out.println("sub");
			
		}else if (operation== +'*') {
			System.out.println("multipication");
			
		}else if (operation== +'/') {
			
			System.out.println("div");
			
		}
		
		else {
			 
			System.out.println( " The number is invalid number");
		}
		}

	}


