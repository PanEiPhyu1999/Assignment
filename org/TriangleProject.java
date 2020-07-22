package FirstBestBright.org;

import java.util.Scanner;

public class TriangleProject {

	public static void main(String[] args) {
		 int i=0,j=0,n=5,k=1;
	        for(i=1; i<n+1; i++)
	        {
	            for(j=0; j<i; j++)
	                System.out.print(" "+k++);
	            System.out.println(" ");
	        }
	}

}
