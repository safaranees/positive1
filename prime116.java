import java.io.;
import java.util.*
public class Prime {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int flag=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=2;i<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                 }
                 else
                 {
                    flag=1;
                 }
             }
             if(flag==1)
             {
                System.out.println(i);
             }
         }
      }
 }
                 
                  
