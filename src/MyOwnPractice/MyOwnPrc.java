package MyOwnPractice;

public class MyOwnPrc {

	public static void main(String[] args) {
		
		String[]cars= {"BMW","Mercedese","Tasla","Toyota","Ford","Honda"};
	// 1 way
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+" ");
			
		}
System.out.println("*********************************");

//2nd way
for(String car:cars) {
	System.out.println(car);
}
	}

}
