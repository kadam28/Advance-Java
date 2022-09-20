//Java Program to Display ODD Numbers From 1 to 100
import java.util.*;
class Program3
{
	void displayOddumber()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String args[])
	{
		Program3 p1=new Program3();
		p1.displayOddumber();
		
	}
}
