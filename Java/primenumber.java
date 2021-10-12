import java.util.Scanner;

public class Prime_number {

	public static void main(String args[])
	{
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		if(num % 2 == 1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("Number is not a prime");
		}
		
	}
}
