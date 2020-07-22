package FirstBestBright.org;

import java.util.Scanner;

public class SevenProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String str=sc.nextLine();
		
		String commaAddedString="";int count=0;
		for(int i=0; i<str.length(); i++) {
			if(count==2) {
				commaAddedString+=";"+str.charAt(i);
				count=1;
			}else {
				commaAddedString+=str.charAt(i);
				count++;
			}
		}
		System.out.println("New comma Delimited Format String:"+commaAddedString);
	}

}
