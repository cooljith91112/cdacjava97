// Author : Indrajith K L
// Program : Reverse each word in a text

// @#KL FLAG : INCOMPLETE

import java.util.*;

class WordReverse
{
	public static void main(String[] args)
	{
		StringBuffer sb;
		int endIndex=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String text = sc.nextLine();
		String[] string_array = new String[text.length()];
		sb = new StringBuffer(text);
		for(int i=0;endIndex<=text.length();i++)
		{
			/*endIndex = sb.indexOf(" ");
			if(endIndex<0)
				break;
			//System.out.println(endIndex);
			string_array[i]=sb.substring(0,endIndex);
			//sb.replace(4,text.length()-1,sb.toString());
			sb.delete(0,endIndex+1);
			//System.out.println(sb.toString());*/
			
		}
		//System.out.println(sb.toString());
		for(int i=0;i<string_array.length;i++)
		System.out.println(string_array[i]);
	}
}
