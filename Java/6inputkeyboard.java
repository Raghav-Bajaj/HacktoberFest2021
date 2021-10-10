import java.util.*;
class Inputkeyboard {
  public static void main(String ar[]) {
    int a, b, s = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the two number");
    a = sc.nextInt();
    b = sc.nextInt();
    s = a + b;
    System.out.println("sum is =" + s);
  }
}
