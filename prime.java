import java.io.*;
import java.util.*;
class Prime
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int p=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                p++;
            }
        }
        if(p==2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
