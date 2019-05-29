import java.util.Scanner;
import java.lang.*;
class Main
{
public static void Prime(int n)
{
  int i,j,k=0;
  for(i=2;i<=n;i++)
  {
    for(j=2;j<=i-1;j++)
    {
      if(i%j==0)
      {
        k=1;
        break;
      }
      else{
        k=0;
      }
    }
    if(k==0)
    {
      System.out.println(i);
    }
  }
 }
	public static void main (String[] args)
    {
      int n;
	 Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      Main.Prime(n);
    }
}