package FirstBestBright.org;

import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner str=new Scanner(System.in);
				System.out.println("Enter first number");
				String n1=str.nextLine();
				int num1=Integer.parseInt(n1);
				System.out.println("Enter second number");
				String n2=str.nextLine();
				int num2=Integer.parseInt(n2);
				System.out.println("Enter a operator");
				String op=str.nextLine();
				char operator=op.charAt(0);
				switch(operator) {
				case '+':
					System.out.println("The result is "+(num1+num2));
					break;
				case '-':
					System.out.println("The result is "+(num1-num2));
					break;
				case '*':
					System.out.println("The result is "+(num1*num2));
					break;
				case '/':
					System.out.println("The result is "+(num1/num2));
					break;
				default:
					System.out.println("Invalid");
					
				
				}
				


	}

}
