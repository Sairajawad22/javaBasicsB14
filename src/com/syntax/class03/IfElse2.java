package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {
		double money=5;
		
		double kfcBurger=11;
		
		if(money>kfcBurger) {
        System.out.println("yayy i can injoy the burger");
	}else 
		
	{
		System.out.println("i should eat something at home");
	}
		
     if(false) {// we can direcltly ue boolean inside the ()
	
	System.out.println("if block");

     }else{
    	 
		System.out.println("else blok");
		
		boolean isHungry=true;
		if (isHungry) {
			System.out.println( "Lets eat something");
		}else {
			System.out.println( "Lets watch and do some codindg from yotube");
		}
		
	}
}
}