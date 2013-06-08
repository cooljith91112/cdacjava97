class SineSeries
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);
		double sin_x = 0.0;
		int factorial = 1;
		int square_x=1;
		int l = 1,m=0;
		double result = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=l;j>0;j--)
			{
				factorial = factorial * j;
			}
			
			//System.out.println(factorial);
			m = l;
			while(m>0)
			{
				square_x = square_x * x;
				m--;
			}
			//System.out.println(square_x);
			
			result = (double)square_x/factorial;
			if(i%2==0)
			{
				sin_x -= result; 
			}
			else
			{
				sin_x += result;
			}
			
			l = l+2;
			square_x = 1;
			
		}
		System.out.println(sin_x);
	}
}