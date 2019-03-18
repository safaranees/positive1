import java.io.*;
import java.util.*;    
class Minimum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[50];
		int size=s.nextInt();
		int min;
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		min=arr[0];
       		for(int i=1;i<size;i++)
        		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
       		}     
		System.out.println(min);
       	}
}
