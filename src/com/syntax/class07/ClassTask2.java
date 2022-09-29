package com.syntax.class07;

public class ClassTask2 {

	public static void main(String[] args) {
		//print all even numbers from 1 to 20

	    int b =2;

	    while(b<=20) {
	        System.out.print(b+" ");
	            b+= 2;// adding 2 to my variable/  or   b=b+2;                    
          }  
	    
  System.out.println(" another way");
	    
	    int i=1;
	    
	    while(i<=20)
	    {
	        if(i%2==0)
	        {
	        System.out.print(i + " ");
	        }
	        i++;// increment always should be in while loop not in if condition
	        }

	}

}
