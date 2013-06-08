class Triangle
{
public static void main (String ar [])
{
int n=4;
for (int i = 1; i<=4; i++) 
{
for (int k=n-1;k>0;k--)
{
System.out.print ("\t");
}
n--;
for (int j = 1; j<=i; j++)
{
System.out.print (j+"\t");
}
for (int j = i-1; j>0; j--)
{
System.out.print (j+ "\t");
}
System.out.println ("");
}
}
}
