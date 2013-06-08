import java.util.*;

class Book
{
	String bookid="",bookname="",authorname="",publishername="";

	Book()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bookid :");
		bookid = sc.nextLine();
		System.out.println("Enter Book Name :");
		bookname = sc.nextLine();
		System.out.println("Enter Author Name :");
		authorname = sc.nextLine();
		System.out.println("Enter Publisher Name :");
		publishername = sc.nextLine();

	}
	Book(String bkid,String bkname,String authornm,String pbnm)
	{

		this.bookid = bkid;
		this.bookname = bkname;
		this.authorname = authornm;
		this.publishername = pbnm;

	}

	void display()
	{
		System.out.println("\nBook Details\n");
		System.out.println("Book ID\t\t"+bookid);
		System.out.println("Book Name\t"+bookname);
		System.out.println("Author Name\t"+authorname);
		System.out.println("Publisher Name\t"+publishername);
	}
}

class BookClass
{
	public static void main(String[] args) {
		Book BookObj1 = new Book();
		BookObj1.display();

		Book BookObj2 = new Book("1456A","Brief History of Time","Stephen Hawkings","MC Hill");
		BookObj2.display();
	}
}