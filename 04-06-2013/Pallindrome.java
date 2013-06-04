//Author : Vivek Vijayan
// Program : Program to check whether a string is PALLINDROME or not

class Pallindrome
{
	public static void main(String[] args)
	{
		String s1 = "Malayalam";
		char s2[] = new char[s1.length()];
		char revers[] = new char[s1.length()];
		s2 = s1.toCharArray();
		
		for(int i=(s1.length()-1),j=0;i>=0;i--,j++)
		{
			revers[j] = s2[i];
		}
		String reversed_string = new String(revers);
	
		if(s1.equalsIgnoreCase(reversed_string))
		{
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
	}
}