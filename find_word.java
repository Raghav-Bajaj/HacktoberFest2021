// WAP enter a sentence form keyboard and also find all the words in that 
// sentence with starting character as vowel
import java.util.Scanner;
class Assginment2
{
	public static void main(String[] arg) 
	{
		String store="\n";
		char vowel=a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String take=sc.nextLine();
		String[] arr=take.split(" ");		
		for (String s : arr) 
		{
			System.out.println(s);
			int le=s.length();
			String[] arr2=new String[le];
			arr2=
			if (arr2[0]==vowel) 
			{
				store+=s;
			}
		}
		System.out.println("These are the words which start with vowel : "+store);
	}
}
