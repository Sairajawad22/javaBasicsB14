package reviewClass2;

public class Exam7 {

	public static void main(String[] args) {
		boolean a,b,c;
		a=b=c=true;
		if(a||(b&&c)) {
			
			System.out.println("if executed");
		}
		else {
			System.out.println("else executed");	
		}
	}

}
