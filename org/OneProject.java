package FirstBestBright.org;

import java.util.Scanner;

public class OneProject    {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	System.out.println("Enter a String");
	 String str = input.nextLine();
	 char result=str.charAt(str.length()-1);
	 System.out.println( str+result);
	
	}

}
