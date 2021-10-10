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
    System.out.println("priority of Thread1:" + t.getPriority());
    System.out.println("name of running Thread:" + t.getName());
    t.setName("COVID-19");
    System.out.println("new name is" + t.getName());
  }
}