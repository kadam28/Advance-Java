//Server-1 Program
import java.net.*;
import java.io.*;
class ServerDemo
{
		public static void main(String args[]) throws Exception
		{
						ServerSocket ss=new ServerSocket(9090);
						Socket s=ss.accept();
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
						DataInputStream	din=new DataInputStream(s.getInputStream());
					    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
						String str1="";
						while(!str1.equals("bye"))
						{
								str1=din.readUTF();
								System.out.println("Client Says:"+str1);
								str1=br.readLine();
								dout.writeUTF(str1);
						}
						
						ss.close();
						s.close();
						
		}
}