import javax.swing.*;
import java.awt.event.*;
class Cal extends JFrame{
JLabel f1,f2,f3;
JButton b;
JTextField t1,t2;
Cal(){}
public Cal(String a){ super(a);}
public void example(){
	f3=new JLabel();
	f1=new JLabel("first number");
	t1=new JTextField();
	f2=new JLabel("enter multiplier");
	t2=new JTextField();
	b=new JButton("Tap here for Result!");
	f1.setBounds(50,50,100,30);
	t1.setBounds(160,50,80,30);
	f2.setBounds(50,110,100,30);
	t2.setBounds(160,110,80,30);
	b.setBounds(120,200,150,20);
	b.addActionListener(new Inner());
	f3.setBounds(120,20,150,30);
	add(f3);
	add(f1);
	add(t1);
	add(f2);
	add(t2);	
}
class Inner implements ActionListener{
	public void actionPerformed(ActionEvent e){
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		f3.setText("multiplication of "+x+" and "+y+"is ="+(x*y));
	}
}
public static void main(String []args){	
Cal f=new Cal("table");
f.example();
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,500);
}
}