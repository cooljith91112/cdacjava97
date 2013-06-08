class Harmionic{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		double result = 0.0f;
		
		for(int i=1;i<=n;i++)
		{
			result=result+(1/(double)i);
			System.out.println(result);
		}
		
		System.out.println("harmonic series for n="+n+" is "+result);
		
	}
}