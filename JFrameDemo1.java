//JFrame window
import javax.swing.*;
class JFrameDemo1 extends JFrame
{
	JFrameDemo1(String title)
	{
		super(title);
	}
	public static void main(String args[])
	{
		JFrameDemo1 f1=new JFrameDemo1("VJTech JFrame");
		f1.setVisible(true);
		f1.setSize(600,600);
	}
}