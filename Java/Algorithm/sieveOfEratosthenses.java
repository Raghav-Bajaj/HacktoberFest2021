/*package whatever //do not write package name here */

import java.io.*;

class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n)
    {

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int z = 2; z * z <= n; z++)
        {

            if (prime[z] == true)
            {
                for (int i = z * z; i <= n; i += z)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
 
   
    public static void main(String args[])
    {
        int n = 100;
        System.out.print(
            "The prime numbers are : ");
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}
