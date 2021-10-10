import java.util.*;
abstract class shape {
  abstract void area(int x, int y);
}
class rec extends shape {
  void area(int a, int b) {
    System.out.println("Area of rectangle:" + (a * b));
  }
}
class triangle extends shape {
  void area(int l, int b) {
    System.out.println("Area of trinagle:" + (0.5 * l * b));
  }
}
class myarea {
  public static void main(String args[]) {
    int a, b, l, h;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length breath of rectangle:");
    a = sc.nextInt();
    b = sc.nextInt();
    rec obj1 = new rec();
    obj1.area(a, b);
    System.out.println("Enter base and height of triangle:");
    l = sc.nextInt();
    h = sc.nextInt();
    triangle obj2 = new triangle();
    obj2.area(l, h);
  }
}