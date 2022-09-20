//Client Program
import java.net.*;
import java.io.*;
class ClientEvenOddDemo
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",1000);
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String msg="";
		msg=br.readLine();
		dout.writeUTF(msg);
		msg=din.readUTF();
		System.out.println("Server Says:"+msg);
		s.close();
	}
}