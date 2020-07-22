package FirstBestBright.org;

import java.util.Scanner;

public class FourProject {

	
		
	public static void main(String[] args) {
		String  str = "Hello";
		int ilength = 3;
		if(ilength > str.length()) {
			ilength = str.length();
		}
	String s1 = str.substring(0,str.length()-2);
	System.out.println(s1 + str + s1);

		
	}

}
