import java.util.*;
class try_throws {
  String s;
  int p;
  Scanner sc = new Scanner(System.in);
  void dis() throws NullPointerException {
    System.out.println("enter any string:");
    s = sc.next();
    p = Integer.parseInt(s);
  }
}
class gg {
  public static void main(String args[]) {
    try_throws obj = new try_throws();
    try {
      obj.dis();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
