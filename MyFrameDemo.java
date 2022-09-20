//Display information within frame window
import java.awt.*;
class MyFrameDemo extends Frame
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		setBackground(Color.cyan);
		g.drawString("This is my Frame",130,170);
	}
	public static void main(String args[])
	{
		MyFrameDemo f=new MyFrameDemo();
		f.setVisible(true);
		f.setSize(500,400);
		f.setTitle("Display Message");
	}
}