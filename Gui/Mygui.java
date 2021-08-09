import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
class Mygui{
    int x=70,y=70;
    public static void main(String[] args){
        Mygui gui=new Mygui();
        gui.go();
    }
    public void go(){
    JFrame frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new MyDrawPanel());
    frame.setSize(300,300);
    frame.setVisible(true);
    for(int i=0;i<130;i++){
        x++;
        y++;
        draw.reapaint();
        try{
            Thread.sleep(50);
        }catch(Exception e){}
    }
    static class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}