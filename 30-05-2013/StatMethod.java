class MyClass{
	static int largenumber(int a,int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
}

class StatMethod{
	public static void main(String[] args)
	{
		
		int val1 = MyClass.largenumber(5,6,4);
		int val2 = MyClass.largenumber(15,4,0);
		
		System.out.println(val1+" , "+val2);
	}
}