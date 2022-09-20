//program to demonstrate MenuBar,Menu and MenuItem classes.
import java.awt.*;
class NotePadDemo extends Frame
{
	NotePadDemo()
	{
		setBackground(Color.green);
		
		MenuBar mbr=new MenuBar();
		
		Menu m1=new Menu("File");
		MenuItem m11=new MenuItem("New");
		MenuItem m12=new MenuItem("Open");
		MenuItem m13=new MenuItem("Save");
		MenuItem m14=new MenuItem("Save As");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		
		Menu m2=new Menu("Edit");
		MenuItem m21=new MenuItem("Cut");
		MenuItem m22=new MenuItem("Copy");
		MenuItem m23=new MenuItem("Paste");
		MenuItem m24=new MenuItem("Undo");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		
		
		Menu m3=new Menu("Format");
		MenuItem m31=new MenuItem("Word Wrap");
		MenuItem m32=new MenuItem("Font...");
		m3.add(m31);
		m3.add(m32);
		
		Menu m4=new Menu("View");
		MenuItem m41=new MenuItem("Zoom");
		CheckboxMenuItem m42=new CheckboxMenuItem("Status Bar");
		m4.add(m41);
		m4.add(m42);
		
		Menu m5=new Menu("Help");
		MenuItem m51=new MenuItem("View Help");
		MenuItem m52=new MenuItem("Send Feedback");
		MenuItem m53=new MenuItem("About Notepad");
		m5.add(m51);
		m5.add(m52);
		m5.add(m53);
		
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		mbr.add(m5);
		
		setMenuBar(mbr);
		
	}
	public static void main(String args[])
	{
		NotePadDemo n1=new NotePadDemo();
		n1.setVisible(true);
		n1.setSize(700,500);
		n1.setTitle("Notepad");
	}
}