package class13;

public class HwRecap1 {

	public static void main(String[] args) {
		 String str="hello";
		    int length=str.length();
		    if(!str.isEmpty()&&length%2!=0&&length>=3) {

		        int middleIndex=length/2;
		        System.out.println(str.charAt(middleIndex));
		    }
		}

	}


