import java.util.*;
class lovariable {
  void get() {
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name as local of get():");
    s = sc.next();
    System.out.println(s);
  }
  public static void main(String args[]) {
    String p;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name in main as global");
    p = sc.next();
    System.out.println(p);
    lovariable obj = new lovariable();
    obj.get();
  }
}