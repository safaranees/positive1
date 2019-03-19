import java.io.*;
import java.util.*;

class  NKintegers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(n+" "+k);
		int[] intArray = new int[20];
		int intArr=0;
		for(int i=0;i<n;i++)
		{
			intArray[i]=s.nextInt();

                                     }
		for(int i=0;i<n;i++)
		{ 
			System.out.println(intArray[i]);
		}
		for(int i=0;i<k;i++)
		{
			intArr=intArr+intArray[i];
		}
  		System.out.println(intArr);			
				
	}
}

