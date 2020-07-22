package FirstBestBright.org;

import java.util.Scanner;

public class MultiProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a multiply number you want: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=12; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}

}
