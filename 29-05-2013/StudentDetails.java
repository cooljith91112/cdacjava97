import java.util.*;

class Student
{
	int rollno,mark1,mark2,mark3,total;
	String name = "";

	void getStudDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Name :");
		name = sc.nextLine();

		System.out.println("Enter the Student roll no :");
		rollno = sc.nextInt();


		System.out.println("Enter the Student mark1 :");
		mark1 = sc.nextInt();

		System.out.println("Enter the Student mark2 :");
		mark2 = sc.nextInt();

		System.out.println("Enter the Student mark3 :");
		mark3 = sc.nextInt();

		total = mark1+mark2+mark3;
	}

	void displayDetails()
	{
		System.out.println("\nStudent Details");
		System.out.println("Roll No\t:"+rollno);
		System.out.println("Name \t:"+name);
		System.out.println("Mark1 \t:"+mark1);
		System.out.println("Mark2 \t:"+mark2);
		System.out.println("Mark3 \t:"+mark3);
		System.out.println("Total \t:"+total);

	}
}

class StudentDetails{
	public static void main(String[] args) {
		Student st = new Student();

		st.getStudDetails();
		st.displayDetails();
	}
}