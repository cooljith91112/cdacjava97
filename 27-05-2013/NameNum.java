class NameNum{
	public static void main(String args[])
	{
		String name = args[0];
		int num = Integer.parseInt(args[1]);
		for(int i=0;i<num;i++)
		{
			System.out.print(name + " ");
		}
		
	}
}