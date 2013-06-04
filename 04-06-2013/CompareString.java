// Author : Indrajith K L
// Program : Compare strings using equals(), compareTo() and equalsIgnoreCase()

import java.util.*;

class CompareString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String first,second;
		System.out.println("Enter two strings :");
		first = sc.nextLine();
		second = sc.nextLine();
		
		//-----------------------------
		if(first.equals(second))
		{
			System.out.println("Using equals(): Identical");
		}
		else
			System.out.println("Using equals(): Not Identical");
		
		if(first.equalsIgnoreCase(second))
		{
			System.out.println("Using equalsIgnoreCase(): Identical");
		}
		else
			System.out.println("Using equalsIgnoreCase(): Not Identical");
			
			
		//-----------------------------
		int result = first.compareTo(second);
		System.out.println("Using compareTo()");
		if(result<0)
		{
			System.out.println(first+" is less than "+second);
		}
		else if(result>0)
		{
			System.out.println(first+" is greater than "+second);
		}
		else
			System.out.println(first+" and "+second+" are equal ");
		System.out.println("Using ==");
		if(first==second)
		{
			System.out.println(" The two objects are same");
		}
		else
			System.out.println(" The Two objects are not same");
		
	}
}