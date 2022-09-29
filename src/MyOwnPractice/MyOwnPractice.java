package MyOwnPractice;

public class MyOwnPractice {

	public static void main(String[] args) {
		
	String [] iceCream= { "vanilla","chocolate","pistashio","mango","kulfi"};  	
		
	for (String flavor:iceCream) {
		
		System.out.println(flavor);
		
	}
	System.out.println("-----------------------");
	
	char[]letters= {'A','B','C','D'};
	
	for(char alphabets:letters) {
		
		System.out.println(alphabets);
	}
	System.out.println("-----------------------");
	
	int[]numbers= {10,40,500,750,700};
	
	for (int i=0; i<numbers.length; i++) {
	System.out.print(numbers[i]+" ");	
		
		
	}
	System.out.println();
	
	
	for (int n:numbers) {
		System.out.print(n);	
		
	}
}	

}