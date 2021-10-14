package com.company;

import java.util.Scanner;

public class Question42 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0,j,c=1,k=0;
        int m=1;char letter='0';
        char str[]=s.toCharArray();

        for(i=0;i<str.length;i++)
        {
            c=1;
            for(j=i+1;j<str.length;j++) {
                if (str[i] == str[j] && str[j]!=' ') {
                    c++;
                    str[j]='0';

                }
            }
            if(c>1 && str[i]!='0')
            {
                if(c>m)
                {
                    m=c;
                    letter=str[i];
                }
            }
        }
        if(m>1)
            System.out.println("maxinmum occuring character with count= "+m+" "+letter);
        else
        {
            System.out.println("all have equal");
        }
    }

}
