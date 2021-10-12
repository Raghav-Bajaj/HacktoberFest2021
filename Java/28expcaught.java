import java.io.*;
class M {
  void method() throws IOException {
    throw new IOException("device error");
  }
}
class Test{
  public static void main(String args[]) {
    try {
      M t = new M();
      t.method();
    } catch (Exception e) {
      System.out.println("exception handled");
    }
    System.out.println("normal flow...");
  }
}
