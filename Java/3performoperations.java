import java.util.*;
class operator {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    a = sc.nextInt();
    System.out.println("Enter second number:");
    b = sc.nextInt();
    System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    if (a > b)
      System.out.println("Subtraction of" + a + " and " + b + " is " + (a - b));
    else
      System.out.println("subtraction of " + b + " and " + a + " is " + (b - a));
    System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    if (a > b) System.out.println("Division of " + a + " and " + b + " is " + (a / b));
    else System.out.println("Division of" + b + " and " + a + " is " + (b / a));
  }
}