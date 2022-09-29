package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 *  type casting => converting one data type to another data type and we have
         to use ()
		 * 2 types of converting casting 
		 * small=> largest no issue 
		 * large => small their will well be issue
		 */
		
		byte box1=127;// smallest box
		short box2=3333; // double size of box1 in terms of bits (slightly large box)
		int box3=45454545;// 32 bits( large box most commonly used
		long box4= 656868569;// slightly large box
		float box5= 8479674f;// larger box
		double box6=676474687; // largest box
		
		int number=(int)15.2;//we cannot store the decimal number in a box of double
		System.out.println(number);
		byte smallerBox=(byte) box2;
		System.out.println(smallerBox);
		
		short biggerBox = box1;// we are converting large=> small no issue
		long box7= box1;// we can do this because box7 is larger than box1
		float box8=(float) box6; // we are trying to fit box6 into box8 which is float and bigger
		// As box6 is bigger it is double we need type casting to assign the value 
		char a= (char) 68;
		System.out.println(a);
        int box9=(int)box4;
        System.out.println(box9);
        
        
	}

}
