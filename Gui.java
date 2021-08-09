import javax.swing.*;
import java.awt.event.*;
class Gui extends JFrame{
JLabel f1,f2,f3;
JButton b;
JTextField t1,t2;
Gui(){}
public Gui(String a){ super(a);}
public void example(){
	f1=new JLabel("first number");
	f2=new JLabel("second number");
	t1=new JTextField();
	t2=new JTextField();
	b=new JButton("add");
	f3=new JLabel();
	f1.setBounds(50,50,100,30);
	t1.setBounds(160,50,80,30);
	f2.setBounds(50,110,100,30);
	t2.setBounds(160,110,80,30);
	b.setBounds(120,200,90,20);
	b.addActionListener(new Inner());
	f3.setBounds(120,250,100,30);
	add(f1);
	add(t1);
	add(f2);
	add(t2);
	add(b);
	add(f3);	
}
class Inner implements ActionListener{
	public void actionPerformed(ActionEvent e){
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		f3.setText("sum is ="+(x+y));
	}
}
public static void main(String []args){	
Gui f=new Gui("first app");
f.example();
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
}
}