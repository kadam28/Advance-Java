//Program to demonstrate JComboBox
import javax.swing.*;
import java.awt.*;
class JComboBoxDemo extends JFrame
{
	JComboBoxDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		JComboBox jc=new JComboBox();
		jc.addItem("C Lang");
		jc.addItem("C++ Lang");
		jc.addItem("JAVA Lang");
		jc.addItem("Python Lang");
		
		add(jc);
	}
	public static void main(String args[])
	{
		JComboBoxDemo j1=new JComboBoxDemo();
		j1.setVisible(true);
		j1.setTitle("JComboBox Control");
		j1.setSize(600,600);
	}
	
}
