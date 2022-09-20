//program to demonstrate Scrollbar control
import java.awt.*;
class ScrollbarDemo extends Frame
{
	ScrollbarDemo()
	{
		setLayout(null);
		
		setBackground(Color.pink);
		
		Scrollbar vsb=new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		Scrollbar hsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
		vsb.setBackground(Color.green);
		hsb.setBackground(Color.cyan);
		vsb.setBounds(450,30,40,455);
		hsb.setBounds(10,450,430,40);
		add(vsb);
		add(hsb);
		
	}
	public static void main(String args[])
	{
		ScrollbarDemo sd=new ScrollbarDemo();
		sd.setVisible(true);
		sd.setTitle("TextArea Control");
		sd.setSize(500,500);
	}
}
