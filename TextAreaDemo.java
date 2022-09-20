//program to demonstrate TextArea control
import java.awt.*;
class TextAreaDemo extends Frame
{
	TextAreaDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.green);
		setForeground(Color.red);
		
		TextArea ta=new TextArea("Enter feedback here",15,25);
		add(ta);
	}
	public static void main(String args[])
	{
		TextAreaDemo tad=new TextAreaDemo();
		tad.setVisible(true);
		tad.setTitle("TextArea Control");
		tad.setSize(500,500);
	}
}