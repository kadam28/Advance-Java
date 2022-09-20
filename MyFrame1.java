//Write Advanced Java program to display Frame window
import java.awt.*;
class MyFrame1 extends Frame
{
	MyFrame1(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		MyFrame1 f1=new MyFrame1("VJTech Academy");
		f1.setVisible(true);
		f1.setSize(600,600);
		//f1.setTitle("First Window");
	}
}