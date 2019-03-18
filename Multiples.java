import java.util.*;
import java.io.*;
class Multiples
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m;
      for(int i=1;i<=n;i++)
      {
         m=i*n;
         System.out.println(m+" ");
      }
   }
}
