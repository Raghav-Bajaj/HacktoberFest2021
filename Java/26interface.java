import java.util.*;
interface a {
  public
  default void display() {
    int n;
    System.out.println("display of interface1");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number:");
    n = sc.nextInt();
    System.out.println("Interface 1: " + n);
  }
}
interface b {
  public
  default void display() {
    int n;
    System.out.println("display of interface2");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number:");
    n = sc.nextInt();
    System.out.println("Interface 2: " + n);
  }
}
class c implements a, b {
  public void display() {
    a.super.display();
    b.super.display();
  }
  public static void main(String args[]) {
    c obj = new c();
    obj.display();
  }
}