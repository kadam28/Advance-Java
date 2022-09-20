//program to demonstrate dialog box.
import java.awt.*;
class DialogDemo extends Frame
{
	public static void main(String args[])
	{
		DialogDemo dd=new DialogDemo();
		dd.setVisible(true);
		dd.setTitle("Frame Window");
		dd.setSize(600,500);
		
		Label L1=new Label("VJTech Academy!!!");
		Dialog d1=new Dialog(dd,"Model Dialog Box",false);
		d1.add(L1);
		d1.setVisible(true);
		d1.setSize(400,400);
	}
}