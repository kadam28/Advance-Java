//To check whether number is palindrome or not in Java
import java.util.*;
class PalindromeDemo
{
	public static void main(String args[])
	{
		int no,reverse=0,rem,temp;
		Scanner sc=new Scanner(System.in);             
		System.out.println("Enter Any Number:");
		no=sc.nextInt();
		temp=no;
		while(no>0)
		{
			   rem=no%10;
			   reverse=reverse*10+rem;
			   no=no/10;
		}
		if(temp==reverse)
			System.out.println("Number is Palindrome!!!");
		else
			System.out.println("Number is not Palindrome!!!");

	}
}