import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class rev extends JFrame {
  JLabel l1, l2, l3;
  JButton b1;
  JTextField j1;
  Container c;
  rev() {}
  rev(String str) {
    super(str);
  }
  public void set() {
    c = this.getContentPane();
    c.setBackground(Color.BLUE);
    l1 = new JLabel("REVERSE");
    l2 = new JLabel("Enter your number");
    l3 = new JLabel();
    l1.setForeground(Color.BLACK);
    l2.setForeground(Color.BLACK);
    b1 = new JButton("FIND IT");
    j1 = new JTextField();
    setLayout(null);
    l1.setBounds(50, 50, 200, 30);
    l2.setBounds(50, 80, 100, 30);
    j1.setBounds(150, 80, 100, 30);
    b1.setBounds(150, 140, 80, 30);
    l3.setBounds(100, 200, 200, 30);
    b1.addActionListener(new Handler3());
    add(l1);
    add(l2);
    add(l3);
    add(b1);
    add(j1);
    add(l3);
  }
  class Handler3 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      int s = 0, i;
      int n = Integer.parseInt(j1.getText());
      int temp = n;
      while (n != 0) {
        i = n % 10;
        s = s * 10 + i;
        n = n / 10;
      }
      l3.setText("your reverse num-->" + s);
    }
  }
  public static void main(String args[]) {
    rev f = new rev("Reverse");
    f.set();
    f.setVisible(true);
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}