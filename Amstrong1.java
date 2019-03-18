import java.io.*;
import java.util.Scanner;
class Armstrong1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a+1;i<b;i++)
        {
            int digits=0;
            int result=0;
            int num=i;
            while(num!=0)
            {
                num=num/10;
                ++digits;
            }
            num=i;
            while(num!=0)
            {
                int rem=num%10;
                result+=Math.pow(rem,digits);
                num=num/10;
            }
            if(result==i)
            {
                System.out.println(i+" ");
            }
        }
    }
}

       
