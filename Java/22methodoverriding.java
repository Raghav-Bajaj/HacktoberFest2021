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
  void m1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    name = sc.next();
    System.out.println(name + " is in first child");
  }
}
class tr {
  public static void main(String args[]) {
    b obj = new b();
    obj.m1();
  }

}
