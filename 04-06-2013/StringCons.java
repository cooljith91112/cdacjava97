// Author : Vivek Vijayan
// Program : Create String using different constructors

class StringCons 
{
public static void main (String ar [])
{
	String s;// = new String ();
	char chars [] = {'a', 'b','c','d'};
	s = new String (chars);
	System.out.println (s);
	s=new String (chars, 1,3);
	System.out.println (s);
	String s1 = new String (s);
	System.out.println (s1);
}
}