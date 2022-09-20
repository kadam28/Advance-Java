//Java program to calculate area of circle,triangle,rectangle
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AreaDemo extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JLabel L1,L2,L3,L4,L5,L6;
	AreaDemo()
	{
			setLayout(null);
			b1=new JButton("Area of Circle");
			b2=new JButton("Area of Rectangle");
			b3=new JButton("Area of Triangle");
			
			tf1=new JTextField(10);
			tf2=new JTextField(10);
			tf3=new JTextField(10);
			tf4=new JTextField(10);
			tf5=new JTextField(10);
			
			L1=new JLabel("Enter Radius:");
			L2=new JLabel("Enter Length:");
			L3=new JLabel("Enter Breadth:");
			L4=new JLabel("Enter Base:");
			L5=new JLabel("Enter Height:");
			L6=new JLabel("                                          ");
			
			
			L1.setBounds(10,10,80,30);
			tf1.setBounds(100,10,80,30);
			L2.setBounds(190,10,80,30);
			tf2.setBounds(280,10,80,30);
			L4.setBounds(370,10,80,30);
			tf3.setBounds(460,10,80,30);
			L3.setBounds(190,60,100,30);
			tf4.setBounds(280,60,80,30);
			L5.setBounds(370,60,80,30);
			tf5.setBounds(460,60,80,30);
			
			b1.setBounds(70,110,140,30);
			b2.setBounds(230,110,140,30);
			b3.setBounds(390,110,140,30);
			L6.setBounds(200,170,500,30);
			
			add(b1);add(b2);add(b3);
			add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);
			add(L1);add(L2);add(L3);add(L4);add(L5);add(L6);

			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int radius=Integer.parseInt(tf1.getText());
			float area=(float)(3.14*radius*radius);
			L6.setText("Area of Circle:"+area);
		}
		else if(ae.getSource()==b2)
		{
			int length=Integer.parseInt(tf2.getText());
			int breadth=Integer.parseInt(tf4.getText());
			int area=length*breadth;
			L6.setText("Area of Rectangle:"+area);	
		}
		else
		{
			int base=Integer.parseInt(tf3.getText());
			int height=Integer.parseInt(tf5.getText());
			float area=(float)(0.5*base*height);
			L6.setText("Area of Triangle:"+area);				
		}
		
	}
	public static void main(String args[])
	{
		AreaDemo j1=new AreaDemo();
		j1.setVisible(true);
		j1.setTitle("Calculate Area Project");
		j1.setSize(600,400);
	}
}