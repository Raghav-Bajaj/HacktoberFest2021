import java.util.*;
class stvariable {
  static String s;
  void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name:");
    s = sc.next();
    System.out.println("hello! " + s);
  }
  public static void main(String args[]) {
    stvariable obj = new stvariable();
    obj.get();
    System.out.println("In main method");
    System.out.println("hello! " + s + " in main method");
  }
}
