import java.util.*;
class a {
  String name;
  void m1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    name = sc.next();
    System.out.println(name + " is in parent class");
  }
}
class b extends a {
  String name;
  void m2() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    name = sc.next();
    System.out.println(name + " is in first child");
  }
}
class c extends a {
  String name;
  void m3() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    name = sc.next();
    System.out.println(name + " is in 2nd child class");
  }
}
class tr {
  public static void main(String args[]) {
    c obj = new c();
    obj.m1();
    obj.m3();
    b obj2 = new b();
    obj2.m1();
    obj2.m2();
  }
}