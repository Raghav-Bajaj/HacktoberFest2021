package com.company;

import javax.swing.*;
import java.util.*;

public class Question48 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=str.toLowerCase().replaceAll(" ","");
        char temp[]=s.toCharArray();
   HashSet<Character> set=new HashSet<>();
        for(char ch:temp)
        {
            set.add(ch);
        }
        System.out.println(set);
        if(set.size()==26)
        System.out.println("yes pangram");
        else{
            System.out.println("not pangarm");
        }
    }
}
