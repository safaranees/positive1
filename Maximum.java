import java.io.*;
import java.util.*;
class Maximum
{
 	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[50];
		int max;
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
   			arr[i]=s.nextInt();
		}
		max=arr[0];
 		for(int i=1;i<size;i++)
    		{
    			if(arr[i]>max)
     			{
    				max=arr[i];
			}
     		 }
		System.out.println(max);
	}
}
     
     
