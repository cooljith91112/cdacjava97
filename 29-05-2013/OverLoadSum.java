class Sum
{
	int findSum(int a, int b)
	{
		return(a+b);
	}	

	float findSum(float a, float b)
	{
		return(a+b);
	}

	double findSum(double a, double b)
	{
		return(a+b);
	}
}

class OverLoadSum
{
	public static void main(String[] args) {
		Sum sm = new Sum();
		
		System.out.println(sm.findSum(45,65)+"");
		System.out.println(sm.findSum(45.64f,65.12f)+"");
		System.out.println(sm.findSum(45.548754587878,65.545645645644)+"");

	}
}