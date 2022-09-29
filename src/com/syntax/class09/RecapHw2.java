package com.syntax.class09;

public class RecapHw2 {

	public static void main(String[] args) {
		// third way digital clock
		  for (int h = 0; h < 24; h++) {// control hours

	            for (int m1 = 0; m1 <= 5; m1++) {// control first digit of minutes

	                for (int m2 = 0; m2 <= 9; m2++) {// control 2nd digit of minutes

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	            }
		  }
	}

}
