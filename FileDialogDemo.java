//program to demonstrate FileDialog box
import java.awt.*;
import java.awt.event.*;
class FileDialogDemo extends Frame implements ActionListener
{
	Button b1,b2;
	FileDialogDemo()
	{
		setLayout(new FlowLayout());
		setBackground(Color.green);
		setForeground(Color.red);
		b1=new Button("Open FileDialog");
		b2=new Button("Save FileDialog");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			FileDialog f1=new FileDialog(this,"Open File Dialog",FileDialog.LOAD);
			f1.setVisible(true);	
		}
		else
		{
			FileDialog f1=new FileDialog(this,"Save File Dialog",FileDialog.SAVE);
			f1.setVisible(true);			
		}
	}
	public static void main(String args[])
	{
		FileDialogDemo fdd=new FileDialogDemo();
		fdd.setVisible(true);
		fdd.setSize(500,500);
		fdd.setTitle("Frame Parent Window");
	}
}