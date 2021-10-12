import java.util.*;
class si {
  int p, t;
  float si, r;
  public si() {
    r = 0;
    p = 0;
  }
  public void getdata() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter principle : ");
    p = sc.nextInt();
    System.out.println("Enter rate : ");
    r = sc.nextFloat();
    System.out.println("Enter time period : ");
    t = sc.nextInt();
  }
  public void cal() {
    si = (p * r * t) / 100;
  }
  public void display() {
    System.out.println("Principle : Rs" + p);
    System.out.println("Rate : " + r);
    System.out.println("Time period : " + t);
    System.out.println("Simple Interest : Rs" + si);
  }
  public static void main(String args[]) {
    si s = new si();
    s.getdata();
    s.cal();
    s.display();
  }
}
