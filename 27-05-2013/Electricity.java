class Electricity
{
	public static void main(String[] args)
	{
		int unit = Integer.parseInt(args[1]);
		float tariff=0.0f,charge;
		int category = Integer.parseInt(args[0]);
		
		switch(category)
		{
			case 1: tariff =1.00f;break;
			case 2: tariff = 1.75f;break;
			case 3: tariff = 2.50f;break;
			case 4: tariff = 3.00f;break;
			default: System.out.println("Invalid input");
		}
		
		charge = (float)unit * tariff;
		
		System.out.println("Total Charge = " + charge);
	}
}