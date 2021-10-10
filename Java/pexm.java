import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyGarde extends JFrame {
	JLabel l1, l2;
	JTextField t1;
	JButton b;

	MyGarde() {

	}

	MyGarde(String str) {
		super(str);
	}

	public void set_Componet() {

		l1 = new JLabel("Enter Your Marks %");
		l2 = new JLabel();
		t1 = new JTextField();
		b = new JButton("Calculate Grade");
		setLayout(null);
		l1.setBounds(50, 80, 150, 30);
		t1.setBounds(200, 80, 100, 30);

		b.setBounds(150, 140, 155, 30);
		l2.setBounds(150, 200, 100, 30);
		b.addActionListener(new Handler());
		
		
		add(l1);
		add(l2);
		add(t1);
		add(b);
	}

	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			int a = Integer.parseInt(t1.getText());
			String c = "";
			if(a>=75 && a<=100) {
				c = "A";
			}else if(a>=60 && a<75){
				c = "B";
			}else if(a>=45 && a<60) {
				c = "C";
			}else if(a>=30 && a<45) {
				c = "D";
			}else if(a>=0 && a<30) {
				c = "F";
			}else {
				c = "Type percentage correctly";
			}
			l2.setText("Grade is " + c);
		}
	}

	public static void main(String arg[]) {
		MyGarde ms = new MyGarde("Grade");
		ms.set_Componet();
		ms.setVisible(true);
		ms.setSize(500, 300);
		ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color c = new Color(230, 230, 230);
		ms.getContentPane().setBackground(c);
	}
}class pexm {
    
}
