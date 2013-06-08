import java.util.*;

interface Exam
{
	boolean pass (int a);
}
interface Classify
{
	String division (int b);
}
class Result implements Exam,Classify
{
	public boolean pass (int mark)
	{
		if (mark >=50)
			return true;
		else
			return false;
	}
	
	public String division (int average)
	{
		if (average>=60)
			return "First";
		else
			if (average >=50 && average<60)
				return "Second";
			else 
				return "No Division";
	}
	public static void main (String ar [])
	{
	Scanner sc = new Scanner (System.in);
	int mark = sc.nextInt ();
	Result rt = new Result();
	System.out.println (""+rt.pass (mark));
	System.out.println (""+rt.division (mark));
	}

}
