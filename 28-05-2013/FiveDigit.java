class FiveDigit
{
public static void main (String ar [])
{
	int a = Integer.parseInt (ar [0]);
	int num = a;
	int reminder = 0, tens = 1,result=0;
	
	
	for (int i=0;i<5;i++)
	{
		reminder = num%10;
		num=num/10;

		if(i>0)
		{
			tens = tens*10;
			
		}
		
		reminder +=1;
		
		if (reminder/10>0)
			reminder = reminder%10;
	
		result = result+reminder*tens;
		
	}
	System.out.println ("Result :"+result);
}
}
