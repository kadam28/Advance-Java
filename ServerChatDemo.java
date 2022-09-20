//Server Program
import java.net.*;
import java.io.*;
class ServerChatDemo
{
	public static void main(String args[])throws Exception
	{
			ServerSocket ss=new ServerSocket(1000);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			String msg;
			
			msg=din.readUTF();
			
			System.out.println(msg);
	}
}