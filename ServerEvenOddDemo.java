//Server Program
import java.net.*;
import java.io.*;
class ServerEvenOddDemo
{
	public static void main(String args[])throws Exception
	{
			ServerSocket ss=new ServerSocket(1000);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			int no;
			String msg;
			no=Integer.parseInt(din.readUTF());
			System.out.println("Number received from client:"+no);
			if(no%2==0)
			{
				msg="Number is EVEN";
			}
			else
			{
				msg="Number is ODD";
			}
			dout.writeUTF(msg);				
			
			s.close();
	}
}