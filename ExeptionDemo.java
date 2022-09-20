import java.io.*;
class ExeptionDemo
{
	public static void main(String args[])throws IOException
	{
		int a,b;
		float c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Number:");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number:");
		b=Integer.parseInt(br.readLine());
		try
		{
			throw new NullPointerException();
			//c=a/b;
			//System.out.println("Division Result="+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
