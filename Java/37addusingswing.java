import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MySwing_Add2 extends JFrame {
  JLabel l1, l2, l3, l4;
  JTextField t1, t2;
  JButton b;
  MySwing_Add2() {}
  MySwing_Add2(String str) {
    super(str);
  }
  public void set_Componet() {
    l1 = new JLabel(" The sum of two numbers");
    l2 = new JLabel("Enter 1st Number");
    l3 = new JLabel("Enter 2nd Number");
    l4 = new JLabel();
    t1 = new JTextField();
    t2 = new JTextField();
    b = new JButton("ADD");
    setLayout(null);
    l1.setBounds(50, 50, 200, 30);
    l2.setBounds(50, 80, 100, 30);
    t1.setBounds(150, 80, 100, 30);
    l3.setBounds(50, 110, 100, 30);
    t2.setBounds(150, 110, 100, 30);
    b.setBounds(150, 140, 80, 30);
    l4.setBounds(100, 200, 100, 30);
    b.addActionListener(new Handler());
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(t1);
    add(t2);
    add(b);
  }
  class Handler implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      int a = Integer.parseInt(t1.getText());
      int b = Integer.parseInt(t2.getText());
      int c = a + b;
      l4.setText("Sum is :" + c);
    }
  }
  public static void main(String arg[]){
    MySwing_Add2 ms = new MySwing_Add2("MY Swing2 for add ");
     ms.set_Componet();
      ms.setVisible(true); 
      ms.setSize(500,500); 
      ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      Color c= new Color(205,92,92); 
      ms.getContentPane().setBackground(c); 
    }
 }