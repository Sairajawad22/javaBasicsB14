package com.syntax.class11;

public class Phone1 {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
String name;
String model;
String size;
String color;
String storage;
int price;


void videoCall() {
	
	System.out.println(name+"can easily do video call");
	
}
void downloadApp() {
	System.out.println(name+ model+"make human life easy by downloading any application");
	
}	
void screebRecord() {
	
	System.out.println("we can easily record vido from screen with"+ name);
	
}
public static void main (String[] args) {
	Phone1 iphone= new Phone1();
	iphone .name="iphone";
	iphone .model="14Pro";
	iphone .size ="6,7inch";
	iphone.color="deep purple";
	iphone .storage="256gb";
	iphone .price=1200;
	iphone .downloadApp();
	
	Phone1 Pixel=new Phone1();
	Pixel.name="Pixel";
	Pixel.model="6pro";
	Pixel.size="6.5";
	Pixel.color="black";
	Pixel.storage="6pro";
	Pixel.price=1099;
	Pixel. videoCall();
	
	Phone1 Samsung =new Phone1();
	Samsung.name="Samsung";
	Samsung.model="Samsung Z Fold4";
	Samsung.size="7.6";
	Samsung.color="Graygreen";
	Samsung.storage="512gb";
	Samsung.price=2159;
	Samsung.downloadApp();
	
	System.out.println( Samsung.size+"we can easily record vido from screen with");
	
	
	
}


}
