import java.util.*; class instvariable {
    String s; 
    void get(String d) {
    s=d;
    } 
    void display() {
    System.out.println("your name is "+s); }
    public static void main(String args[]) {
    String st;
    Scanner sc=new Scanner(System.in);
    instvariable obj=new instvariable();
    System.out.println("enter any string:");
    st=sc.next();
    obj.get(st); 
    obj.display();
    } }
