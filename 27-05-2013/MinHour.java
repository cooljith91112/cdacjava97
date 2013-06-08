class MinHour
{
	public  static void main(String[] args)
	{
		int min = Integer.parseInt(args[0]);
		
		int hour,min_sec;
		hour = min/60;
		min_sec =  min - (hour*60);
		System.out.println(min + "mins = "+ hour + "hr "+min_sec+ "mins");
	}
}