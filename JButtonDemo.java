//program to demonstrate JButton class
import javax.swing.*;
import java.awt.*;
class JButtonDemo extends JFrame
{
	JButtonDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JButton b1=new JButton("OK");
		JButton b2=new JButton("CANCEL");
		JButton b3=new JButton("RETRY");
		JButton b4=new JButton(new ImageIcon("vjtech.jpg"));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public static void main(String args[])
	{
		JButtonDemo f1=new JButtonDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("JButton Control");
	}
}