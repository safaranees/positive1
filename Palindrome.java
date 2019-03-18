
import java.io.*;
import java.util.*;
class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0,rem;
        int num=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}

