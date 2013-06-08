class DigitSum
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]),sum=0;
		int back = num;
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println(" Sum od digits of "+back+ " = "+ sum );
		
	}
}