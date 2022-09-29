package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
	/* if class whose object we are creating
	 * is present inside the same package
	 * we don't need to import it
	  */
	Phone iphone= new Phone();
	iphone.make="Apple";
	iphone.model="Iphone 14 Pro Max";
	iphone.years=2022;
	iphone.storage=128;
	iphone.makeCall();// when we call the the object
	// new Phone()=> To creat the object
	Phone sumsungPhone=new Phone();
	sumsungPhone.model="22 Ultra";
	sumsungPhone.make="Sumsung";
	sumsungPhone.years=2022;
	sumsungPhone.makeCall();
	
	}

}
