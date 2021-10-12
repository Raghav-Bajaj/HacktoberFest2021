import java.util.*;
class th extends Thread {
  public void run() {
    int i, p;
    Scanner sc = new Scanner(System.in);
    for (i = 1; i <= 10; i++) {
      System.out.println("enter any number:");
      p = sc.nextInt();
      System.out.println(p);
    }
  }
}
class gg {
  public static void main(String args[]) {
    th t = new th();
    t.start();
  }
}
