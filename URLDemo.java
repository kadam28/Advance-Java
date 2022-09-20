import java.net.*;
class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
			URL u1=new URL("http://www.vjtechacademy.com:80/about.html");
			System.out.println("Protocol="+u1.getProtocol());
			System.out.println("Host Name="+u1.getHost());
			System.out.println("Port Number="+u1.getPort());
			System.out.println("File Path="+u1.getFile());
	}
}