// Author : Vivek Vijayan
// Program : Arrange names in alphabetical order

import java.util.*;
class Alphabet
{
	public static void main (String ar [])
	{
		int n;
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		String temp;
		
		System.out.println ("Enter the number of names");
		n=sc.nextInt();
		String[] names = new String[n];
		for (int i=0;i<n;i++)
			names[i]=sc1.nextLine();
			
		for (int i =0; i<n;i++)
			for (int j=i+1; j<n;j++)
			{
				if (names[i].compareTo(names[j]) >0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		System.out.println ("Alphabetically arranged names");	
		for (int i=0;i<n;i++)
			System.out.println (names[i]);
	}
}