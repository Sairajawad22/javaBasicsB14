package com.syntax.class07;

public class Hw44 {

	public static void main(String[] args) {
		// second way
		int o1=21;
		while(o1<=50) {
		if(o1%2==1)	{
			System.out.print(o1+" ");	
		}
		o1++;

	}
		System.out.print("------------------------- ");	
		for(int a=21; a<=50; a+=2) {
			if(a%2==0) {
				System.out.print(a+" ");	
			}
		}
	}
}
