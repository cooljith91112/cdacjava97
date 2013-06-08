class Reverse
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		int num =number;
		int rem = 0;
		String reverse="";
		while(num>0)
		{
			rem = num % 10;
			num = num / 10;
			
			reverse = reverse + rem;
		}
		System.out.println(reverse);
	}
}