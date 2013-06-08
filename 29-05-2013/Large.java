import java.util.*;

class Large{
	public static void main(String[] args) {
		int n,numbers[];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements :");
		n = sc.nextInt();

		numbers = new int[n];

		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
			numbers[i] = sc.nextInt();

		int large = numbers[0];
		for(int i=0;i<n;i++)
		{
			if(numbers[i]>large)
				large = numbers[i];
		}

		System.out.println("Largest number = "+large);
	}
}