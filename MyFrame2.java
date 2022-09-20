//Write Advanced Java program to display Frame window
import java.awt.*;
class MyFrame2 extends Frame
{
	MyFrame2(String str)
	{
		setVisible(true);
		setSize(600,600);
		setTitle(str);
	}
	public static void main(String args[])
	{
		MyFrame2 f1=new MyFrame2("VJTech Academy");
	}
}