import java.util.*;
class Area {
  Area(int r) {
    System.out.println("area of circle: " + (3.14 * r * r));
  }
  Area(int a, int b) {
    System.out.println("area of rect: " + (a * b));
  }
  Area(double p, double q) {
    System.out.println("area of triangle:" + (0.5 * p * q));
  }
}
class Areao {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("radius of circle: ");
    int r = sc.nextInt();
    Area A1 = new Area(r);
    System.out.println("enter sides of rect: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Area A2 = new Area(a, b);
    System.out.println("enter sides of triangle: ");
    double p = sc.nextDouble();
    double q = sc.nextDouble();
    Area A3 = new Area(p, q);
  }
}
