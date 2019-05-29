import java.util.Scanner;
class Main{
 public static int sum(int n)
{
   int i,su=0;
   for(i=1;i<=n;i++)
   {
     su=su+i;
   }
  return su;
}
	public static void main (String[] args)
    {
      int n,m;
	 Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=Main.sum(n);
      System.out.println(m);
	}
}