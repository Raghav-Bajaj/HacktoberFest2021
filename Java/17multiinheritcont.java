class A {
    A() {
      System.out.println("in class A");
    }
  }
  class B extends A {
    B() {
      System.out.println("in class B");
    }
  }
  class C extends B {
    C() {
      System.out.println("in class C");
    }
  }
  class Multilevel {
    public static void main(String ar[]) {
      A a = new A();
      B b = new B();
      C c = new C();
    }
  }