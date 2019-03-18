import java.io.*;
import java.util.*;

class Armstrong
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=num;
		int rem,result=0;
		while(num1!=0)
		{
			rem=num1%10;
			result=result+rem*rem*rem;
			num1=num1/10;
		}
		if(result==num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
