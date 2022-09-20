//Write Advanced Java program to display Frame window
import java.awt.*;
class MyFrame extends Frame
{
	public static void main(String args[])
	{
		MyFrame f1=new MyFrame();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("First Window");
	}
}