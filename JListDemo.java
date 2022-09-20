//Program to demonstrate JList
import javax.swing.*;
import java.awt.*;
class JListDemo extends JFrame
{
	JListDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		String lang[]={"Hind","English","Marathi"};
		
		JList L1=new JList(lang);
		add(L1);
		
	
	}
	public static void main(String args[])
	{
		JListDemo j1=new JListDemo();
		j1.setVisible(true);
		j1.setTitle("JList Control");
		j1.setSize(600,600);
	}
	
}
