//Client-1 Program
import java.net.*;
import java.io.*;
class ClientDemo
{
		public static void main(String args[]) throws Exception
		{
					Socket s=new Socket("localhost",9090);
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					DataInputStream	din=new DataInputStream(s.getInputStream());
					DataOutputStream dout=new DataOutputStream(s.getOutputStream());
					String str1="";
					while(!str1.equals("bye"))
					{
							str1=br.readLine();
							dout.writeUTF(str1);
							str1=din.readUTF();
							System.out.println("Server Says:"+str1);
					}					
					s.close();
		}
}