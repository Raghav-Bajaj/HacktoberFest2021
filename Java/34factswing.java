import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class fact extends JFrame {
  JLabel l1, l2, l3;
  JButton b1;
  JTextField j1;
  Container c;
  fact() {}
  fact(String str) {
    super(str);
  }
  public void set() {
    c = this.getContentPane();
    c.setBackground(Color.RED);
    l1 = new JLabel("FACTORIAL");
    l2 = new JLabel("Enter your number-->");
    l3 = new JLabel();
    l1.setForeground(Color.BLACK);
    l2.setForeground(Color.BLACK);
    b1 = new JButton("FIND IT!!!");
    j1 = new JTextField();
    setLayout(null);
    l1.setBounds(50, 50, 200, 30);
    l2.setBounds(50, 80, 100, 30);
    j1.setBounds(150, 80, 100, 30);
    b1.setBounds(150, 140, 80, 30);
    l3.setBounds(100, 200, 200, 30);
    b1.addActionListener(new Handler2());
    add(l1);
    add(l2);
    add(l3);
    add(b1);
    add(j1);
    add(l3);
  }
  class Handler2 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      int f = 1, i;
      int n = Integer.parseInt(j1.getText());
      for (i = 1; i <= n; i++)
        f = f * i;
      l3.setText("your factorial is---->" + f);
    }
  }
  public static void main(String args[]) {
    fact f = new fact();
    f.set();
    f.setVisible(true);
    f.setSize(500, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}