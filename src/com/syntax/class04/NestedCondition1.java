package com.syntax.class04;

public class NestedCondition1 {

	public static void main(String[] args) {

		int time=5;
		String day="Monday";
		/*
		 * it is called outer if-condition when it is true then only inner condition will executed 
		 * when its is fall nothing from inner if-condition will be executed. it is like the main door 
		 * if the main door is closed. we cannot enter the building
		 */
		
        // Outer if condition
		if(day.equals("Monday")) { //is a string is an non primitive we cannot use ==sign we have to use equals.method
			
		//inner if conditions
			if (time>7) {
		System.out.println("lets go to the office");	                       // inner if conditions
		
	}
         if(time<6) { 
        	 System.out.println("lets sleep more");
         }
}
}
}