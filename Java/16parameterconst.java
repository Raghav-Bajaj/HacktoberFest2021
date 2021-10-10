import java.util.*;
class student {
  int rollno;
  String name;
  student(String n, int r) {
    name = n;
    rollno = r;
    System.out.println("Hello! " + name + " of roll no " + rollno);
  }
}
class abc {
  public static void main(String args[]) {
    String n;
    int r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    n = sc.next();
    System.out.println("Enter your rollno:");
    r = sc.nextInt();
    student obj = new student(n, r);
  }
}
