class Assign10{
	public static void main(String args[])
	{
		int year;
		if(args.length==0){
			System.out.println("Invalid Inputs");
		}
		else
		{	
			year = Integer.parseInt(args[0]);
			if((year%4==0 || year%100==0) && year%400!=0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a leap year");
		}
	}
}
