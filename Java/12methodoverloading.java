import java.util.*;
class Addition {
  void sum(int a, int b) {
    System.out.println("sum is:" + (a + b));
  }
  void sum(int p, int q, int r) {
    System.out.println("sum is:" + (p + q + r));
  }
}
class Add {
  public static void main(String ar[]) {
    int a, b, p, q, r;
    Addition e = new Addition();
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    p = sc.nextInt();
    q = sc.nextInt();
    r = sc.nextInt();
    e.sum(a, b);
    e.sum(p, q, r);
  }
}