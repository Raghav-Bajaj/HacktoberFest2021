class A {
    void m1() {
      System.out.println("in class A");
    }
  }
  class B extends A {
    void m2() {
      System.out.println("in class B");
    }
  }
  class C extends B{
    void m3() {
      System.out.println("in class C");
    }
  }
  class Multilevels {
    public static void main(String ar[]) {
      A a = new A();
      B b = new B();
      C c = new C();
      c.m1();
      c.m2();
      c.m3();
      b.m2();
      b.m1();
      a.m1();
    }
  }
