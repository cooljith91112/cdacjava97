import java.util.*;

class IllegalMarkException extends Exception
{
	IllegalMarkException()
	{
		System.out.println("Illegal Mark");
	}
}

class MarkProcess
{
	int Validation(int mark) throws IllegalMarkException
	{
		if(mark<0)
			throw new IllegalMarkException();
		if(mark>=40)
			return 1;
		else 
			return 0;
	}
}

class MarkResult {
	public static void main(String[] args) throws IllegalMarkException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the regno and Mark :");
		int regno = sc.nextInt();
		int mark = sc.nextInt();
		MarkProcess mk = new MarkProcess();
		int result = mk.Validation(mark);
		
		if(result==1)
			System.out.println("PASS");
		else
			System.out.println("Fail");
	}
}