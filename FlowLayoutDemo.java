//program to demonstrate FlowLayout Manager
import java.awt.*;
class FlowLayoutDemo extends Frame
{
	FlowLayoutDemo()
	{
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER,20,20);
		setLayout(f1);
		
		Button b1=new Button("India");
		Button b2=new Button("America");
		Button b3=new Button("China");
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		FlowLayoutDemo fld=new FlowLayoutDemo();
		fld.setVisible(true);
		fld.setSize(500,500);
		fld.setTitle("FlowLayout Manager");
	}
}