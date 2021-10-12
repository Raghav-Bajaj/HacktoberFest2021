package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[])
	{
	
		int num1;
		int fact = 1 , i=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		num1 = sc.nextInt();
		
		while(num1 >= i)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("The Factorial of a number is = " + fact);
	}
}
