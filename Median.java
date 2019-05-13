import java.util.*;
 
public class Median
{
    // Function for calculating mean
    public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += a[i];
     
        return (double)sum / (double)n;
    }
 
    // Function for calculating median
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
        return (double)a[n / 2];
     
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
 
    // Driver program
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int a[] = new int[5];
        for(int i=0;i<n1;i++)
        {
            	a[i]=s.nextInt();
        }
        int n = a.length;

        System.out.println("Median = " + findMedian(a, n)); 
    }
}
