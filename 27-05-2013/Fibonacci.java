class Fibonacci
{
	public static void main(String[] args)
	{
		int f1=0,f2=1,f3;
		int num = Integer.parseInt(args[0]);
		System.out.print(f1+ " " + f2 + " ");
		for(int i=0;i<num;i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3 + " ");
		}
	}
}