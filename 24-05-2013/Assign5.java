class Assign5{
	public static void main(String[] args)
	{
		int april,may,june;
		float average_rainfall;
		if(args.length==0 || args.length<3)
			System.out.println("Please specify a valid Input");
		else
		{
			april = Integer.parseInt(args[0]);
			may = Integer.parseInt(args[1]);
			june = Integer.parseInt(args[2]);
			average_rainfall = (float)(april+may+june)/3;
			System.out.println("Rainfall for April\t: "+april+"\nRainfall of May\t\t: "+may+"\nRainfall of June\t: "+june+"\nAverage rainfall\t: "+average_rainfall);
		}
	}
}