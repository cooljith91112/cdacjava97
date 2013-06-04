//Author : Indrajith K L
// Program : To find number of words in a text (using basic methods)

import java.util.*;
class NumWords
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text;
		int count =0;
		System.out.println("Enter the text :");
		text = sc.nextLine();
		int length = text.length();
		char[] chars = new char[length];
		chars = text.toCharArray();
		for(int i=0;i<chars.length;i++)
			if(chars[i]==' '&& i>0 && chars[i-1]!=' ')
			{
				count++;
			}
			
		count++;
		System.out.println(count);
	}
}