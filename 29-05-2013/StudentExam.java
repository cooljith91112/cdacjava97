import java.util.*;
class Students
{
	int num_subjects,marks[],total;
	String name;

	void init(int subjects)
	{
		name = "";
		total = 0;
		num_subjects = subjects;
		marks = new int[num_subjects];
	}

	void getDetails()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the Student : ");
		name = sc.nextLine();

		System.out.println("Enter marks of "+num_subjects + "Subjects\n");
		for(int i=0;i<num_subjects;i++)
		{
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}



	}
	void display()
	{
		System.out.println("Name\t:"+name);
		System.out.println("Marks\t:");
		for(int i=0;i<num_subjects;i++)
			System.out.print(marks[i]+ ",");

		System.out.println("\nTotal marks\t:"+total);
	}
}


class StudentExam{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students :");
		n = sc.nextInt();
		Students[] st = new Students[n];
		
		for(int i=0;i<n;i++)
			st[i] = new Students();

		System.out.println("Enter the number of Subjects :");
		m = sc.nextInt();
		for(int i=0;i<n;i++)
			st[i].init(m);


		for(int i=0;i<n;i++)
		{
			st[i].getDetails();
		}

		for(int i=0;i<n;i++)
		{
			st[i].display();
			System.out.println("");
		}

		
	}
}