package reviewClass2;

public class recupClass2 {

	public static void main(String[] args) {
		//Explicit/narrowing/manual 
		// as we can't fit 129in byte we will get wrong results
		short largerBox= 129;
		byte smallerBox= (byte)largerBox;
		System.out.println(smallerBox);
		//Explicit/narrowing/manual 
				// as we can fit 129in byte we will get proper results
		
		int largerBox1=129; 
        short smallerBox2=(short)largerBox1;
        System.out.println(smallerBox2);
        
        //Implicit/widening/Automatically
        short smallerBox3=45;
        long largerbox3=(smallerBox3);
        System.out.println(smallerBox2);
        

	}

}
