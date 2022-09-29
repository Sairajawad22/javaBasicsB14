package com.syntax.class11;

public class Phone { // created class phone
	  String make;
	    String model;
	    String color;
	    int storage;
	    double size;
	    boolean cheap;
	    void call() {// we atributed this behavior
	        System.out.println("calling .......");
	    }

	    void takePicture() {
	        System.out.println("Taking pictures");
	    }

	    public static void main(String[] args) {// we have to call the methed
	        // Name of Class variable name = new Name of class ();
	        Phone iphone=new Phone();
	        iphone.make="Apple";
	        iphone.model="Iphone 14 Pro Max";
	        iphone.color="Black";
	        iphone.storage=128;
	        iphone.size=6.8;
	        iphone.cheap=false;
	        System.out.println("Make "+iphone.make+" Model "+iphone.model);
	        iphone.call();

	        System.out.println("*");

	        Phone samsungPhone=new Phone();// first we have to creat this so we can access to the belew properties
	        samsungPhone.make="Samsung";
	        samsungPhone.model="S22 Ultra";
	        samsungPhone.color="Grey";
	        samsungPhone.storage=256;
	        samsungPhone.size=6.7;
	        samsungPhone.cheap=false;

	        System.out.println(iphone.make);

	        System.out.println(samsungPhone.make);





	    }

	}

