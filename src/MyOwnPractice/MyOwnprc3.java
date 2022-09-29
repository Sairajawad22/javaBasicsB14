package MyOwnPractice;

public class MyOwnprc3 {

	public static void main(String[] args) {
		String[][]countries= {
				{"Usa", "Canada"},// 1 arrays with index0
				{"Peru", "Brazil", "Colombia", "Ecuador" },// 2 arrays with index1
				{"Ethopia", "Egypt", "Kenya"},//3 rows
				{"Germany", "Turkiya", "Moldova","Ukrain"},//4 rows
				{"Kazakhstan", "Afghanistan", "Koria"},// 5rows
				
		};
		System.out.println(countries.length);
		int elOf1arr=countries[0].length;
		System.out.println(elOf1arr);
		int elOf2arr=countries[1].length;
		System.out.println(elOf2arr);
		int elOf3arr=countries[2].length;
		System.out.println(elOf3arr);
		int elOf4arr=countries[3].length;
		System.out.println(elOf4arr);
		int elOf5arr=countries[4].length;
		System.out.println(elOf5arr);
	
// how to get all elements from 2d raays we need nested loop
	// outer loop taking care of rows 
	// inner loop taking care of colom
		
		//Simple for loop
		for(int r=0; r<countries.length; r++) {// it gives the total number of rows -->5
			
			for(int c=0; c<countries[r].length; c++) {// it gives the total number of coloms --> r will be cha
					
				System.out.print(countries[r][c]+" ");
	
		}
			System.out.println();
			System.out.println("----------------------------------");
			
			for(String[] country:countries) {
				
				for(String c:country) {
					if(c.equals("Afghanistan")) {
						System.out.println(c+ "It is my home country:)");
					}else {
					System.out.println(c+"  ");
				
				}
			}
			}
		}
	
	}	
}
