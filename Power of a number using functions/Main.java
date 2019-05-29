import java.util.Scanner;
import java.lang.*;
class Main
{
public static int Power(int base,int exp)
{
  int r;
  r=(int)Math.pow(base,exp);
  return r;
}
	public static void main (String[] args)
    {
      int n,m,p;
	 Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=sc.nextInt();
      p=Main.Power(n,m);
      System.out.println(p);
    }
}