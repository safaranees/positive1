import java.io.*;
import java.util.*;
class PowerNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int e=s.nextInt();
        int pow=1;
        while(e!=0)
        {
            pow=pow*num;
            e--;
        }
        System.out.println(power);
    }
}

   
