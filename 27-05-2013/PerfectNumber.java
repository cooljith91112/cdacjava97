class PerfectNumber{	public static void main(String[] args)	{		int num = Integer.parseInt(args[0]);		int sum = 0;		for(int i=1;i<num;i++)		{			if(num%i==0)			{				sum = sum + i;			}		}				if(sum == num)			System.out.println("Perfect Number!");		else			System.out.println("Not a perfect number");	}}