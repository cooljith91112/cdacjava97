class Assign4{
	public static void main(String[] args)
	{
		int a,b=160;
		byte c,d=6;
		
		a = d;
		//Widening
		System.out.println("a ="+a);
		
		//Narrowing
		c = (byte)b;
		System.out.println("c ="+c);
		
		
	}
}