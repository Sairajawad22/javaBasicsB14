package com.syntax.class07;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		int num=1;
		while(num<=3) {
			System.out.println("I am while loop");
			num++;// while loop always check the condition first
			// in while loop we know how many time will the code execute
		}
   System.out.println("------------------------");
   int num1=1;
   
    do {// always check the condition last/ if true it execute/ if not not execute
    	// in do loop we don't know how many time will the code execute
	System.out.println("I am do while loop ");
	
    num1++;
     }while(num1<=3);
	}

}
