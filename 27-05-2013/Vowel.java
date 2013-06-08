class Vowel
{
	public static void main(String[] args)
	{
		String mychar = args[0];
		int flag = 0;
		switch(mychar)
		{
			case "a": flag = 1;break;
			case "e": flag = 1;break;
			case "i": flag = 1;break;
			case "o": flag = 1;break;
			case "u": flag = 1;break;
			default:System.out.println("Not a VOWEL");
		}
		if(flag==1)
			System.out.println("VOWEL");
	}
}