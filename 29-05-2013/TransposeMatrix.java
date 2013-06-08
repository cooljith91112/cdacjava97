import java.util.*;
class TransposeMatrix
{
	public static void main(String args[])
	{
		int myMatrix[][],n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of matrix");
		n = sc.nextInt();

		myMatrix = new int[n][n];
		System.out.println("Enter the matrix elements :");

		for(int i=0;i<n;i++)		
			for(int j=0;j<n;j++)
				myMatrix[i][j]=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(myMatrix[j][i]+" ");

			System.out.println("");
		}

	}
}