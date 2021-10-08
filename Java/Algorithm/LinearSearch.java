import java.util.Scanner;

public class LinearSearch
{
   public static void main(String args[])
   {
       int i, num, n, a=0, p=0;
       int arr[] = new int[10];
       Scanner sn= new Scanner(System.in);
      
       System.out.print("Enter Size : ");
       n = sn.nextInt();
      
       System.out.print("Enter Elements : ");
       for(i=0; i<n; i++)
       {
           arr[i] = sn.nextInt();
       }
      
       System.out.print("Number to be Search : ");
       num = sn.nextInt();
      
       for(i=0; i<n; i++)
       {
           if(arr[i] == num)
           {
               a = 1;
               p = i+1;
               break;
           }
       }
       if(a == 0)
       {
           System.out.print("Number you entered is not found");
       }
       else
       {
           System.out.print("Your num is "+ num + " found at " + p);
       }
   }
}