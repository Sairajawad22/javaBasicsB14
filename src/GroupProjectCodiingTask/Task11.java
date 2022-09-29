package GroupProjectCodiingTask;

public class Task11 {

	public static void main(String[] args) {
		
		// Write a program to print out duplicate elements from an Array of Strings?

		String[] name= {"New York","Washington DC","Clifornia","Taxes","Washington DC","Taxes"};
        for(int i=0;i<name.length;i++) {
            for(int j=i+1;j<name.length;j++) {
                if(name[i]==name[j])
                    System.out.println(name[j]+" ");
            }
        }
	}

}
