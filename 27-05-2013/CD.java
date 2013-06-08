class CD{
	public static void main(String args[])
	{	
		int a,b,c,d;
		float result;
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		c= Integer.parseInt(args[2]);
		d= Integer.parseInt(args[3]);
		if((c-d)!=0)
		{
			result =(float)(a+b)/(c-d);
			System.out.println("Result = "+result);
		}
	}
}