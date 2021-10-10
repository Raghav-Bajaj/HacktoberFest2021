import java.util.*;
class Simple {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("enter 1st element");
      int a = sc.nextInt();
      int data = 50 / 0;
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("rest of the code...");
  }
}