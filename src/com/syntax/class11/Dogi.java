package com.syntax.class11;

public class Dogi {
	
	//Create a Dog Class and create 3 different objects of it: Husky, 
	//Bulldog, Labrador  with specific  attributes and behaviors.
	String name;
	String breed;
	String size;
	String color;
	int age;
	
	void eat() {
		System.out.println(name+color+ " eat free chicken and sweet potato ");
	}
	void sleep() {
		System.out.println(name+ " sleep 12 to 16 hours per day ");	
		
	}
	void run() {
		System.out.println(name+size+ " they can't run more than 3 miles ");
	}
	  public static void main(String[] args) {
		  
		Dogi husky =new Dogi();
		husky.name="Husky";
		husky.breed="Siberian";
		husky.size="20-24in";  
		husky.color="gray and white";  
		husky.age= 15;
		husky.sleep();
		
		Dogi Bulldog =new Dogi();
		Bulldog.name="Bulldog";
		Bulldog.breed="American";
		Bulldog.size="12-16in";
		Bulldog.color="fawn and white";
		Bulldog.age=10;
		Bulldog.eat();
		
		Dogi Labrador =new Dogi();
		Labrador.name="Labrador";
		Labrador.breed="British";
		Labrador.size="21-24in";
		Labrador.color="black";
		Labrador.age=14;
		Labrador.run();
		
		System.out.println(Bulldog.breed);
	  }
	  
	}

