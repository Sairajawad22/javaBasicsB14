package com.syntax.class12;

public class Dog {
//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	// states
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	// behavior
	void bark() {
		
		System.out.println( name+ "  barking a lot");
		
	}
	void jumping(){
	System.out.println(name+ "  jumping very high");	
}
	void running() {
		System.out.println(name+ "  running fast");		
		
		
	}
	public static void main(String[] args) {
		
		Dog Husky=new Dog();
		Husky. name= "Husky";
		Husky. color= "White and Gray";
		Husky.breed="northen";
		Husky.weight=60.0;
		Husky.age=15;
		Husky.running();
		System.out.println("------------------------------------------");
		
		Dog Bulldog=new Dog();
		Bulldog.name="Bulldog";
		Bulldog.color="fawn";
		Bulldog.breed="French";
		Bulldog.weight=40;
		Bulldog.age=10;
		
		System.out.println("Bulldog lifespan is " + Bulldog.age);
		System.out.println("------------------------------------------");
		

		Dog Labrador=new Dog();
		Labrador.name="Labrador";
		Labrador.color="yellow";
		Labrador.breed="British";
		Labrador.weight=70;
		Labrador.age=14;
		
		

		System.out.println("Labrador breed is " + Labrador.breed+ " and weight is until "+ Labrador.weight
		 );
		
		
		
		
	}
}	
