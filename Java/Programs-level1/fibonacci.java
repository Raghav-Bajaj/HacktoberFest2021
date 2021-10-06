/*package whatever //do not write package name here */

import java.io.*;

class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 12;
    System.out.println(fib(n));
    }
}
