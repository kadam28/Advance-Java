//Program to demonstrate CardLayout
import java.awt.*;
import java.awt.event.*;
class PanelDemo1 extends Panel
{
	PanelDemo1()
	{
		setLayout(new FlowLayout());
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		Button b3=new Button("Retry");
		add(b1);
		add(b2);
		add(b3);
	}
}
class PanelDemo2 extends Panel
{
	PanelDemo2()
	{
		setLayout(new FlowLayout());
		Checkbox c1=new Checkbox("Male");
		Checkbox c2=new Checkbox("Female");
		add(c1);
		add(c2);
	}
}
class PanelDemo3 extends Panel
{
	PanelDemo3()
	{
		setLayout(new FlowLayout());
		Choice c1=new Choice();
		c1.add("India");
		c1.add("China");
		c1.add("US");
		c1.add("UK");
		add(c1);
	}
}
class CardLayoutDemo extends Frame implements ActionListener
{
	Button b1,b2;
	CardLayout c1;
	Panel p;
	CardLayoutDemo()
	{
		setLayout(new BorderLayout());
		PanelDemo1 p1=new PanelDemo1();
		PanelDemo2 p2=new PanelDemo2();
		PanelDemo3 p3=new PanelDemo3();
		
		b1=new Button("Next");
		b2=new Button("Previous");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		Panel pb=new Panel();
		pb.add(b1);
		pb.add(b2);
		
		p=new Panel();
		
		c1=new CardLayout();
		p.setLayout(c1);
		p.add(p1,"Panel 1");
		p.add(p2,"Panel 2");
		p.add(p3,"Panel 3");
		
		add(pb,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		
		pb.setBackground(Color.green);
		p.setBackground(Color.cyan);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			c1.next(p);
		}
		else
		{
			c1.previous(p);
		}
	}
	public static void main(String args[])
	{
		CardLayoutDemo cld=new CardLayoutDemo();
		cld.setVisible(true);
		cld.setTitle("CardLayout Manager");
		cld.setSize(600,600);
	}
}






















