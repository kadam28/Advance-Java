//Program to demonstrate JCheckbox
import javax.swing.*;
import java.awt.*;
class JCheckboxDemo extends JFrame
{
	JCheckboxDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		JCheckBox c1=new JCheckBox("C Lang");
		JCheckBox c2=new JCheckBox("C++ Lang");
		JCheckBox c3=new JCheckBox("JAVA Lang");
		
		add(c1);
		add(c2);
		add(c3);
	}
	public static void main(String args[])
	{
		JCheckboxDemo j1=new JCheckboxDemo();
		j1.setVisible(true);
		j1.setTitle("JCheckBox Control");
		j1.setSize(600,600);
	}
	
}
