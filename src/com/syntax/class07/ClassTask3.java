package com.syntax.class07;

public class ClassTask3 {

	public static void main(String[] args) {
/*
 * Print numbers from 100 to 1
 * Print even numbers from 20 to 100 
  Print only odd numbers from 100 to 1 (2 different ways)
 */
		 int a=100;
	        while(a>=1) {
	            System.out.print(a+" ");
	            a--;
	        }
	        System.out.println("---------------------- "); 
	        
	     int b=20;
	     while(b<=100) {
	         System.out.print(b+" ");
	         b+=2;
	     }
	     System.out.println("---------------------- "); 
	     int c=100;
	     while(c>=1) {
	         if(c%2==1) {
	             System.out.print(c+" ");
	         }
	         c--;
	     }
	     System.out.println("---------------------- "); 
	     int x=99;
	     while(x>=1) {
	    	 System.out.print(x+" "); 
	    	 x-=2;
	     }
		
	}

}
