import java.util.*;
class emp {
  int gd;
  String name;
  void get(String name, int gd) {
    this.name = name;
    this.gd = gd;
  }
  void dis() {
    System.out.println("Name:" + name + " " + "Marks:" + gd);
  }
}
class e {
  public static void main(String args[]) {
    String s;
    int m;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    s = sc.next();
    System.out.println("Enter your marks:");
    m = sc.nextInt();
    emp obj = new emp();
    obj.get(s, m);
    obj.dis();
  }
}
