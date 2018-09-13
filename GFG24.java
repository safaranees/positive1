
import java.io.*;
import java.util.*;
 
public class GFG {
    public static int swap(int itself,
                            int dummy)
    {
        return itself;
    }
    static void sortit(int []arr, int n)
    {
        for (int i = 0; i < n; i++) 
        {
            while (i != (arr[i] - 1)) 
                arr[i] = swap(arr[arr[i] - 1],
                    arr[arr[i] - 1] = arr[i]);     
        }
    }
     
// Driver code
    public static void main(String args[])
    {
        int []arr = {10, 7, 9, 2, 8, 
                              3, 5, 4, 6, 1};
        int n = arr.length;
        sortit(arr, n);
    
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    }
}
 
