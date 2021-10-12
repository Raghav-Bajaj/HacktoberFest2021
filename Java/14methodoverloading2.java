import java.util.*;
class myarea {
  void area(int l, int b) {
    System.out.println("Area of rectangle:" + (l * b));
  }
  void area(double b, double h) {
    System.out.println("Area of triangle:" + (0.5 * b * h));
  }
  void area(double r) {
    System.out.println("Area of circle:" + (3.142 * r * r));
  }
}
class Do {
  public static void main(String args[]) {
    int a, b;
    double r, bas, h;
    myarea obj = new myarea();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length breath of rectangle:");
    a = sc.nextInt();
    b = sc.nextInt();
    obj.area(a, b);
    System.out.println("Enter radius:");
    r = sc.nextDouble();
    obj.area(r);
    System.out.println("Enter base and height of triangle");
    bas = sc.nextDouble();
    h = sc.nextDouble();
    obj.area(bas, h);
  }
}