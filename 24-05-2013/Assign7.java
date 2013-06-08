class Assign7{
	public static void main(String[] args)
	{
		float C,F;
		if(args.length>0)
		{
			F = Float.parseFloat(args[0]);
			C = (float)((F-32)*5)/9;
			System.out.println(F+" Fahrenheit = "+C+" Celcius");
		}
		
		else
			System.out.println("Invalid Input");
	}
}