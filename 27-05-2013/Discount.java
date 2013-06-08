class Discount
{
	public static void main(String[] args)
	{
		float purchase,net_amount;
		int discount=0;
		purchase = Float.parseFloat(args[0]);
		if(purchase<=1000)
			discount = 10;
		if(purchase>1000 && purchase<=1500)
			discount = 12;
		if(purchase>1500)
			discount = 15;
		
		net_amount = (float)purchase - (purchase*discount)/100;
		
		System.out.println("Sales Amount\t: "+purchase+"\nDiscount\t: "+discount+"\nNet Amount Payable\t: "+net_amount);
	}
}