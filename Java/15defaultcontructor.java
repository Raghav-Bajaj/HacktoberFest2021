import java.util.*;
class fault {
  int a;
  fault() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    a = sc.nextInt();
    if (a >= 18)
      System.out.println("Eligible for voting");
    else System.out.println("Not Eligible for voting");
  }
}
class abdc {
  public static void main(String args[]) {
    fault obj = new fault();
  }
}