package GroupProjectCodiingTask;

public class Task9 {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
        int[]arr= {10,30,50,20,100};
        int max=arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        {
        System.out.println("The Maximum number is = "+max);
        }
        int min=arr[0];
        for(int j=0; j>arr.length; j++) {
            if(arr[j]>min) {
                min=arr[j];
            }
        }

        System.out.println("The Minimum number is = "+min);
            }
        }
	

