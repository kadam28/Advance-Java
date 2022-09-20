//program to demonstrate GridLayout Manager.
import java.awt.*;
class GridLayoutDemo extends Frame
{
	GridLayoutDemo()
	{
		GridLayout g1=new GridLayout(5,5);
		setLayout(g1);
		setFont(new Font("SansSerif",Font.BOLD,24));
		
		for(int i=1;i<=25;i++)
		{
			add(new Button(i+""));
		}
	}
	public static void main(String args[])
	{
		GridLayoutDemo gld=new GridLayoutDemo();
		gld.setVisible(true);
		gld.setTitle("GridLayout Manager");
		gld.setSize(500,500);
	}
}