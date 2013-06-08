class DivisibleSeven
{
	public static void main(String[] args)
	{
		int count=0,sum=0;
		for(int i=100;i<200;i++)
		{
			if(i%7==0)
			{
				System.out.print(i + " ");
				sum = sum + i;
				count++;
			}
		}
		
		System.out.println("There are total of "+count+" numbers divisible by 7 and their Sum = "+sum);
	}
}