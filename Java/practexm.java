import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyGarde extends JFrame {
  JLabel l2, l4;
  JTextField t1, t2;
  JButton b;
  MyGarde() {}
  MyGarde(String str) {
    super(str);
  }
  public void set_Componet() {
    l2 = new JLabel("Enter your marks %:");
    l4 = new JLabel();
    t1 = new JTextField();
    b = new JButton("Calculate Grade");
    setLayout(null);
    
    l2.setBounds(100, 80, 150, 40);
    t1.setBounds(250, 80, 100, 30);
    b.setBounds(150, 140, 150, 50);
    l4.setBounds(200, 250, 150, 30);
    b.addActionListener(new Handler());
    add(l2);
    add(l4);
    add(t1);
    add(b);
  }
  class Handler implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      int a = Integer.parseInt(t1.getText());
      
      if (a<=100 && a>=75){
        l4.setText("A Grade");
      }
      else if (a<=74 && a>=60 ){
        l4.setText("B Grade");
      }
      else if (a<=59 && a>=45 ){
        l4.setText("C Grade");
      }
      else if (a<=44 && a>=30 ){
        l4.setText("D Grade");
      }
      else if (a<=29 && a>=0 ){
        l4.setText("F Grade");
      }
      else {
        l4.setText("Enter % marks correctly");
      }
    }
  }
  public static void main(String arg[]){
    MyGarde ms = new MyGarde("Grade calculator ");
     ms.set_Componet();
      ms.setVisible(true); 
      ms.setSize(500,500); 
      ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      Color c= new Color(153,102,0); 
      ms.getContentPane().setBackground(c); 
    }
 }