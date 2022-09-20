//Program to demonstrate JTabbedPane class
import javax.swing.*;
import java.awt.*;
class JPanel1 extends JPanel
{
	JPanel1()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		JLabel L1=new JLabel("India");
		JLabel L2=new JLabel("UK");
		JLabel L3=new JLabel("US");
		add(L1);add(L2);add(L3);
	}
}
class JPanel2 extends JPanel
{
	JPanel2()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JButton b1=new JButton("Maharashtra");
		JButton b2=new JButton("Delhi");
		JButton b3=new JButton("Chennai");
		
		b1.setToolTipText("This is Button1");
		b2.setToolTipText("This is Button2");
		b3.setToolTipText("This is Button3");
		
		add(b1);add(b2);add(b3);
	}
}
class JPanel3 extends JPanel
{
	JPanel3()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		JCheckBox c1=new JCheckBox("C Lang");
		JCheckBox c2=new JCheckBox("C++ Lang");
		JCheckBox c3=new JCheckBox("Java Lang");
		add(c1);add(c2);add(c3);
	}
}
class JTabbedPaneDemo extends JFrame
{
		JTabbedPaneDemo()
		{
			JTabbedPane jtp=new JTabbedPane();
			
			JPanel1 jp1=new JPanel1();
			JPanel2 jp2=new JPanel2();
			JPanel3 jp3=new JPanel3();
			
			jtp.addTab("Country",jp1);
			jtp.addTab("State",jp2);
			jtp.addTab("Lang",jp3);
			
			add(jtp);
		}
		public static void main(String args[])
		{
			JTabbedPaneDemo f1=new JTabbedPaneDemo();
			f1.setVisible(true);
			f1.setTitle("JTabbedPane Demo");
			f1.setSize(500,500);
		}
}












