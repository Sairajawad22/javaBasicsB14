package com.syntax.class09;

public class ExampleOfStringInArray {

	public static void main(String[] args) {
		String[]week= {"Monday","Tuesday","Friday","Saturday","Sunday"};
		// if day is a sunday --> it is fun day
		//otherwise --> it is a boring day
		

		for(String days:week) {
			if(days.equals("Sunday")) {
				
				System.out.println(days+"is a fun day");
				
			}else if(days.equals("Friday")) {
				
				System.out.println(days+"is a peace day");
			}else if(days.equals("Saturday")) {
				System.out.println(days+"is a stress day");
				
			}else {
				System.out.println(days+"is a boring day");
		}
		
		}
	}

}
