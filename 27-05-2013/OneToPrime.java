class OneToPrime
{
	public static void main(String[] args)
	{
		int limit = Integer.parseInt(args[0]);
		int flag = 0;
		for(int i=1;i<=limit;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag = 1;
					break;
				}
				 
			}
			
			if(flag == 0)
				System.out.print(" "+i);
			flag =0;
		}
	}
}