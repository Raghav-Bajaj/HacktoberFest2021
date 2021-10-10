import java.awt.*;
class MySwing_Fact extends JFrame {
  JLabel l1, l2, l3, l4;
  JTextField t1, t2;
  JButton b;
  Container c;
  MySwing_Fact() {}
  MySwing_Fact(String str) {
    super(str);
  }
  public void set_Componet() {
    c = this.getContentPane();
    c.setBackground(Color.PINK);
    l1 = new JLabel(" FACTORIAL of a numbers");
    l2 = new JLabel("Enter any integer Number");
    l1.setForeground(Color.RED);
    l3 = new JLabel();
    t1 = new JTextField();
    b = new JButton(" Find Factorial");
    setLayout(null);
    l1.setBounds(50, 50, 200, 30);
    l2.setBounds(50, 80, 100, 30);
    t1.setBounds(150, 80, 100, 30);
    b.setBounds(150, 140, 80, 30);
    l3.setBounds(100, 200, 100, 30);
    b.addActionListener(new Handler2());
    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(b);
  }
  class Handler2 implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      int f = 1, i;
      int n = Integer.parseInt(t1.getText());
      for (i = 1; i <= n; i++) f = f * i;
      l3.setText("Sum is :" + f);
    }
  }
  public static void main(String arg[]) {
    MySwing_Fact ms = newMySwing_Fact("Fatorial value");
    ms.set_Componet();
    ms.setVisible(true);
    ms.setSize(600, 400);
    ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
