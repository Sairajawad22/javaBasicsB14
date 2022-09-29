package com.syntax.class07;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please intere the first number ");
		int num1=scan.nextInt();
		System.out.println("Please intere the second number ");
		int num2=scan.nextInt();
		System.out.println("Please choose the operation");
		char operation=scan.next().charAt(0);
		
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
		
		
		}
		System.out.println( result);

	}

}
