package com.syntax.class06;

import java.util.Scanner;

public class Class6HW33 {

	public static void main(String[] args) {
		// Using scanner class create calculator. Allow user to enter
		//2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
		//Please complete this assignment in 2 ways: using if statement and switch case.
				
		// Second part of question#3(switch case)
		
		
				Scanner scan=new Scanner(System.in);
				System.out.println("Please intere the first number ");
				int num1=scan.nextInt();
				System.out.println("Please intere the second number ");
				int num2=scan.nextInt();
				System.out.println("Please choose the operation");
				char operation=scan.next().charAt(0);
				int sum=num1+num2;
				int sub=num1-num2;
				int multipication=num1*num2;
				double div=num1/num2;
				int result=0;
				
				switch(operation) {
				
				case '+':
					result=num1+num2;
				break;
				
				case '-':
					result=num1-num2;
				break;
				
				case '*':
					result=num1*num2;
				break;
				case '/':
					result=num1/num2;
				break;
				default:
					System.out.println( " The nuber is invalid number");
				
				}
				System.out.println(" The result is " + result);
	}

}
