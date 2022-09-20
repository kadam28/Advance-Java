//Array of Objects
import java.util.*;
class Book
{
	int bookid;
	String bookname;
	float price;
	
	void get_book_info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book ID:");
		bookid=sc.nextInt();
		System.out.println("Enter Book Name:");
		bookname=sc.next();
		System.out.println("Enter Book Price:");
		price=sc.nextInt();	
	}
	void disp_book_info()
	{
		System.out.println(bookid+"\t"+bookname+"\t"+price);
	}
}
class BookMainDemo
{
	public static void main(String args[])
	{
		Book b[]=new Book[5];
		int i;
		//object instantiation	
		for(i=0;i<5;i++)
		{
			b[i]=new Book();
		}
		//get book details for each objects.
		for(i=0;i<5;i++)
		{
			b[i].get_book_info();
		}
		//display book details.
		System.out.println("************************************************");
		System.out.println("**********BOOK MANAGEMENT SYSTEM****************");
		System.out.println("************************************************");
		System.out.println("BOOKID\tNAME\tPRICE");
		System.out.println("=============================");
		for(i=0;i<5;i++)
		{
			b[i].disp_book_info();
		}
	}
}

