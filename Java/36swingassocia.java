import javax.swing.*;
class Simple {
  JFrame f;
  Simple() {
    f = new JFrame();
    JButton b = new JButton("OK");
    b.setBounds(130, 100, 100, 40);
    f.add(b);
    f.setSize(400, 500);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new Simple();
  }
}