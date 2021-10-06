import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {

        int num, reversednum = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Input Number: ");
        num = s.nextInt();

        while(num != 0) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;

            num /= 10;
        }
        System.out.println("--------------------------------");
        System.out.println("Reversed Number: " + reversednum);
    }
}