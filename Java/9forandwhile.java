import java.util.*;
class for_while {
  public static void main(String args[]) {
    int n, s = 1, i = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    n = sc.nextInt();
    System.out.println("using for");
    for (i = 1; i <= n; i++) {
      s = s * i;
    }
    System.out.println("factorial of " + n + " = " + s);
    System.out.println("using while");
    s = 1;
    i = 1;
    while (i <= n) {
      s = s * i;
      i++;
    }
    System.out.println("factorial of " + n + " = " + s);
  }
}