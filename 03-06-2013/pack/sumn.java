package pack;
public class sumn{
	public int findSumn(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
			sum = sum+i;
		return sum;
	}
}