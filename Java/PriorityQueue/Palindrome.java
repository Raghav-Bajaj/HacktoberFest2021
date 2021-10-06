import java.io.*;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str, reverseStr = "";

        System.out.print("Enter a word : ");
        str = s.nextLine();

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome.");
        }
        else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}
