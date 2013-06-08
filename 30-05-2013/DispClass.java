class A
{
	void dispmsg(){
		System.out.println("I'M Class A");
	}
}

class B extends A
{
	void dispmsg(){
		System.out.println("I'M Class B");
	}
}


class C extends B
{
	void dispmsg(){
		System.out.println("I'M Class C");
	}
}

class DispClass
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.dispmsg();
		b.dispmsg();
		c.dispmsg();
	}
}