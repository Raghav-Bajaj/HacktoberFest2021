import java.util.Scanner;

public class Sumofdigit {

	public static void main(String args[])
			{
		int num1;
		int num2 = 0 , rem;
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers = ");
		 num1 = Sc.nextInt();
		 
		 while(num1 !=0)
		 {
			 rem = num1 % 10;
			 num1 = num1 / 10;
			 num2 = num2 + rem;
			 
		 }
		 
		 System.out.println("The Sum Of The Digit is " + num2);
		
			}
}
