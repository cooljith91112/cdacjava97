import pack.*;
import java.util.*;

class MainSum{
	public static void main(String[] args)
	{
		sumn s = new sumn();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int sums = s.findSumn(num);
		System.out.println("Sum = "+sums);
	}
}
