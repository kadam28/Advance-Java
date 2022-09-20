//Sending DatagramPackets using DatagramSocket
import java.net.*;
class DataSender
{
	public static void main(String args[]) throws Exception
	{
			String str="Welcome to world of Networking programming of Advanced Java!!!";
			byte data[]=str.getBytes();
			int len=str.length();
			InetAddress addr=InetAddress.getByName("127.0.0.1");
			DatagramPacket dp=new DatagramPacket(data,len,addr,1010);
			
			DatagramSocket ds=new DatagramSocket();
			ds.send(dp);
			ds.close();
	}
}