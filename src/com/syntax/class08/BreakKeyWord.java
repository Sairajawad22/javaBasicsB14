package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		for(int i=1; i<15; i++) {
			System.out.println("Hello");
			
			if(i==3) {
			break;// break--> break the loop and it usually used inside some type of condition 
			}
		}
		
		System.out.println("End");
	}

}
