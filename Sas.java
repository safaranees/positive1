import java.io.*;
import java.util.*;
class Sas
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int  a=ss.nextInt();
		int d=ss.nextInt();
		int c=n-1;
		int s=(n/2)*(2*a+c*d);
		System.out.println(s);
	}
}

