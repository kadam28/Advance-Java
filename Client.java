//CLIENT program
import java.net.*;
import java.io.*;
class Client
{
	public static void main(String args[]) throws Exception
	{
			Socket s=new Socket("localhost",8989);
			InputStream in=s.getInputStream();
			OutputStream out=s.getOutputStream();
			byte str[]="Hi Server".getBytes();
			out.write(str);
			s.close();
	}
}