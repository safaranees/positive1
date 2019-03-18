import java.io.*;
import java.util.*;
public class Prime
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        for(int i=2;i=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n==1)
        {
           System.out.println("neither composite nor prime");
        }
        else
        {
            if(flag==0);
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}

