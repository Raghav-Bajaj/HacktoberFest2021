import java.util.*;
class add {
  void sum(int a, int b) {
    System.out.println(a + " + " + b + " = " + (a + b));
  }
  void sum(int a, int b, int c) {
    System.out.println(a + " + " + b + " +" + c + " = " + (a + b + c));
  }
}
class Dao {
  public static void main(String args[]) {
    int a, b, c, d, e;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two nos :");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Enter three nos :");
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();
    add obj = new add();
    obj.sum(a, b);
    obj.sum(c, d, e);
  }
}