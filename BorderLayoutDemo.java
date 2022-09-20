//program to demonstrate BorderLayout
import java.awt.*;
class BorderLayoutDemo extends Frame
{
	BorderLayoutDemo()
	{
		BorderLayout blt=new BorderLayout();
		setLayout(blt);
		
		Button b1=new Button("EAST Region");
		Button b2=new Button("WEST Region");
		Button b3=new Button("NORTH Region");
		Button b4=new Button("SOUTH Region");
		Button b5=new Button("CENTER Region");
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		BorderLayoutDemo bld=new BorderLayoutDemo();
		bld.setVisible(true);
		bld.setTitle("BorderLayout Demo");
		bld.setSize(600,500);
	}
}