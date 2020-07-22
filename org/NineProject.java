package FirstBestBright.org;

import java.util.Arrays;
import java.util.Scanner;

public class NineProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr = {1,2,3,4,5,7,9,6,7,3};
		
	        double total = 0;

	        for(int i=0; i<arr.length; i++){
	        	total = total + arr[i];
	        }
	       double average=total/arr.length;
	       System.out.println(Arrays.toString(arr));
	       Arrays.sort(arr);
	       System.out.println("Minimum ="+arr[0]);
	       System.out.println("Maximum ="+arr[arr.length-1]);
	       System.out.println("Minimum ="+arr[1]);
	       System.out.println("Maximum ="+arr[arr.length-2]);

	        System.out.println("The average is:"+average);

	    }


}
