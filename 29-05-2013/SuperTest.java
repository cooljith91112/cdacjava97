class Main{
	
	int mynum;
	
	Main(int r)
	{
		mynum = r;			
	}
	
	void display()
	{
		System.out.println(mynum);
	}
}

class ExtendedMain extends Main{

	ExtendedMain(){
		super(10);
	}
	
}


class SuperTest
{
	public static void main(String args[]){
		ExtendedMain mn = new ExtendedMain();
		mn.display();
	}
}