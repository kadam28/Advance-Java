import java.net.*;
import java.util.*;
class URLConnectionDemo
{
	public static void main(String args[])throws Exception
	{
			URL u1=new URL("https://web.whatsapp.com");
			URLConnection u2=u1.openConnection();
			System.out.println("Date="+new Date(u2.getDate()));
			System.out.println("Type of Contents="+u2.getContentType());
			System.out.println("Length of contents="+u2.getContentLength());
			System.out.println("Expiration Date="+new Date(u2.getExpiration()));
			System.out.println("Last Modified Date="+new Date(u2.getLastModified()));
	}
}