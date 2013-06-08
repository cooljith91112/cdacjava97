class Assign8{
	public static void main(String[] args)
	{
		int a,b,c;
		if(args.length==0 || args.length<3)
			System.out.println("Invalid Input");
		else
		{
			a = Integer.parseInt(args[0]); 
			b = Integer.parseInt(args[1]); 
			c = Integer.parseInt(args[2]); 
			if(a>b)
			{	
				if(a>c)
					System.out.println("Largest is "+a);
				else
					System.out.println("Largest is "+c);
			}
			else
			{
				if(b>c)
					System.out.println("Largest is "+b);
				else
					System.out.println("Largest is "+c);
			}
		}
	}
	
}