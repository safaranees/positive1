import java.io.*;
import java.util.*;
public class Prime
{
    public static void main(String[] args) 
    {
      Scanner num=new Scanner(System.in);
      int a=num.nextInt();
      int b=num.nextInt();
     int c=a+1;
     int d=b-1;
     for(int i=c;i<=d;i++)
     {
      if(i%2==0)
      {
       System.out.println(i);
      }
     }
    }
}

