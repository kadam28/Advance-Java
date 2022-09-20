//frame window in an applet
import java.applet.*;
import java.awt.*;
class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is Frame Window",10,40);
	}
}
public class AppletDemo extends Applet
{
	public void init()
	{
		SampleFrame f=new SampleFrame("Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString("This is Applet Window",10,20);
	}
}
/*<applet code="AppletDemo.class" width=300 height=50>
</applet>*/