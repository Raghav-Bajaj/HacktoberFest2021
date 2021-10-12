import java.util.*;
class Ifelse {
  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x + y > 11) {
      System.out.println("X+Y is greater than 11");
    }
    else{
        System.out.println("X+Y is smaller than 11");
    }
  }
}