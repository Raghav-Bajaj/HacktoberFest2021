import java.util.*;
abstract class a {
  String h;
  abstract void m1();
  void m2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string in abstract class:");
    h = sc.next();
    System.out.println(h + " in abstract class");
  }
}
class b extends a {
  int b;
  void m1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number in child class:");
    b = sc.nextInt();
    System.out.println(b + " in child class");
  }
}
class my {
  public static void main(String args[]) {
    a aref = new b();
    aref.m1();
    aref.m2();
  }
}