//Client Program
import java.net.*;
import java.io.*;
class ClientChatDemo
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",1000);
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		String msg="Hello Server";
		
		dout.writeUTF(msg);
		
		s.close();
	}
}