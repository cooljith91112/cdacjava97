import java.util.*;

class Descending{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10];
		int limit=0,temp=0;
		System.out.println("Enter the number of elements");
		limit = sc.nextInt();
		try
		{
			System.out.println("Enter the elements");
			for(int i=0;i<limit;i++)
				numbers[i] = sc.nextInt();
				
			for(int i=0;i<limit;i++)
				for(int j=i+1;j<limit;j++)
				{
					if(numbers[i]<numbers[j])
					{
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j]=temp;
					}
				}
			System.out.println("Descending order arranged numbers\n");	
			for(int i=0;i<limit;i++)
				System.out.println(numbers[i]+ " ");
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Array size exceeded");
		}
	}
}