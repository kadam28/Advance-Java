//Program to demonstrate List control.
import java.awt.*;
class ListDemo extends Frame
{
	List L1;
	ListDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.green);
		setForeground(Color.red);
		L1=new List(4,true);
		L1.add("C Lang");
		L1.add("C++ Lang");
		L1.add("Java Lang");
		L1.add("Python Lang");
		L1.add("Android Lang");
		L1.add("JavaScript");
		L1.add("Data Structure");
		add(L1);
	}
	public static void main(String args[])
	{
		ListDemo ld=new ListDemo();
		ld.setVisible(true);
		ld.setSize(500,500);
		ld.setTitle("List Control");
	}
}