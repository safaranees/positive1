import java.io.*;
 
class GFG {

static int findSum(int N, int K)
{
int ans = 0;
for (int i = 1; i <= N; i++)
ans += (i % K);
return ans;
}
static public void main(String[] args)
{
int N = 10, K = 2;
System.out.println(findSum(N, K));
}
}
 


