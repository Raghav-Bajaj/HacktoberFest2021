import java.util.*;
class Do {
  public static void main(String args[]) {
    String s;
    int q;
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any string:");
      s = sc.next();
      q = Integer.parseInt(s);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("finally block is always executed");
    }
    System.out.println("Exception handled...");
  }
}