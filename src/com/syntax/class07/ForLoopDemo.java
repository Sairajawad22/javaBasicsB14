package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		/*
		 * for loop demo is very simple, clean and easey compair to while, do while 
		 * most popular among the while and do while
		 * best choice when we know how many times to repeat the block of code in advance
		 * Syntax
		 * for ( initialization; condition; increment/decrement)
		 * exam: Hello five time
		 * 
		 * 1-Declaration happen first/only happen once
		 * 2-Chicken condition happen second
		 * 3- Syso happen
		 * 4-Inc/dec
		 * 5-cond
		 */
		
       for (int i = 1; i<=5; i++ ) {
    	   System.out.print(" Hello ");
       }
       System.out.println("-------------------------");
       // print numbers from 1 to 20
       for( int a=1; a<=20; a++) {
    	   System.out.print(a+ " ");
    	   
       }
       System.out.println("-------------------------");
    // print numbers from 30 to 10
       for(int b=30; b>=10; b--) {
    	   System.out.print(b+ " ");  
       }
       // what is the output
       for(int c=0; c<=10; c+=2) {
    	   System.out.println(c+ " ");  // we get all even numbers
       }
       System.out.println("-------------------------");
       // what is the output
       
       for(int i=10; i<=25; i++) {
    	   System.out.print(i+ " ");  
       }
       
       System.out.println("-------------------------");
       // what is the output
       int sum=0;
    	for(int i=1; i<=6; i++) { // the loop will run 6 times b/c condition true 6 times
    		sum+=i;
    		 System.out.println(sum);// print out only one time b/c it is outside the loop
    	} 
       
	}

}
