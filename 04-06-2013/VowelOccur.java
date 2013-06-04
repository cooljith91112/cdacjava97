// Author : Indrajith K L
// Program : Number of occurence of VOWELS in a text
import java.util.*;
class VowelOccur
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text = new String();
		System.out.println("Enter the String");
		text = sc.nextLine();
		int count=0;
		char[] chars = new char[text.length()];
		chars = text.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			//System.out.print(chars[i]);
			switch(chars[i])
			{
				case 'a':count++; break;
				case 'e':count++; break;
				case 'i':count++; break;
				case 'o':count++; break;
				case 'u':count++; break;
				case 'A':count++; break;
				case 'E':count++; break;
				case 'I':count++; break;
				case 'O':count++; break;
				case 'U':count++; break;
			}
		}
		System.out.println("Number of VOWELS in the text :"+count);
	}
}