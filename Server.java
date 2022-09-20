//SERVER program
import java.net.*;
import java.io.*;
class Server
{
	public static void main(String args[]) throws Exception
	{
			ServerSocket ss=new ServerSocket(8989);
			Socket s1=ss.accept();
			InputStream in=s1.getInputStream();
			OutputStream out=s1.getOutputStream();
			int c;
			while((c=in.read())!=-1)
			{
					System.out.print((char)c);
			}
			ss.close();
	}
}