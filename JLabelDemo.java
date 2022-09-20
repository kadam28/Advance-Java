//program to demonstrate JLabel class
import javax.swing.*;
import java.awt.*;
class JLabelDemo extends JFrame
{
	
	JLabelDemo()
	{
		//FlowLayout fl=new FlowLayout();
		setLayout(null);
		JLabel L1=new JLabel("VJTech Academy");
		ImageIcon ii=new ImageIcon("vjtech.jpg");
		JLabel L2=new JLabel(ii);
		L1.setBounds(10,10,300,80);
		L2.setBounds(30,80,250,250);
		add(L1);
		add(L2);
	}
	public static void main(String args[])
	{
		JLabelDemo f1=new JLabelDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("JLabel Control");
	}
	
}