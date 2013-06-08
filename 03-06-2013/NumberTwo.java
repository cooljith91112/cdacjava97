interface i1
{
	void meth1();
	void meth2();
}
interface i2
{
	void meth3();
}

class NumberTwo implements i1,i2
{
	public void meth1()
	{
		System.out.println ("I am meth1");
	}
	public void meth2()
	{
		System.out.println ("I am meth2");
	}
	public void meth3()
	{
		System.out.println ("I am meth3");
	}
	public static void main (String ar [])
	{
		NumberTwo N2 = new NumberTwo ();
		N2.meth1();
		N2.meth2();
		N2.meth3();
	}
}