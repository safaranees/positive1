import java.io.*;
import java.util.*;
public class Sorting
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[100];
		int temp;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < n ; i++) 
		{
			System.out.println(arr[i]);
		}
		
	}
}
