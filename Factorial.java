import java.io.*;
import java.util.*
class Factorial
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		if(n<0)
		{
			System.out.println("invalid");
		}
		else
		{
			for(int i=`1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
	}
}
