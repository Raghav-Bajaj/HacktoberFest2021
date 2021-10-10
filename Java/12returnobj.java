class ObjectPassDemo {
  int a, b;
  ObjectPassDemo(int i, int j) {
    a = i;
    b = j;
  } // return true if o is equal to the invoking
  boolean equalTo(ObjectPassDemo o) {
    return (o.a == a && o.b == b);
  }
}
class Test {
  public static void main(String args[]) {
    ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
    ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
    System.out.println("ob1 == ob2: " +
      ob1.equalTo(ob2));
  }
}