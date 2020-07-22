package FirstBestBright.org;

import java.util.Scanner;

public class ThirdProject {
       
	private static String swapCharacters(String inputString) {
		int length=inputString.length();
		if(length <= 1) {
			return inputString;
		}else {
			return inputString.charAt(length-1)+ inputString.substring(1,length-1)+inputString.charAt(0);
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		 String str = input.next();
		 System.out.println("Output String:" +swapCharacters(str));
		
	}

}
