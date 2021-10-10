class A {
  void m() {
    System.out.println("inside class A");
  }
}
class B extends A {
  void m() {
    System.out.println("inside class B");
  }
}
class C extends A {
    void m() {
      System.out.println("inside class C");
    }
  }
  class Shapeab {
    public static void main(String ar[]) {
      A ref;
      A a = new A();
      ref = a;
      ref.m();
      C c = new C();
      ref = c;
      ref.m();
      B b = new B();
      ref = b;
      ref.m();
    }
  }
