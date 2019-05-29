import java.util.Scanner;
class Main
{
public static int square(int n)
{
  return n*n;
}
	public static void main (String[] args)
    {
      int n,m;
	 Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=Main.square(n);
      System.out.println(m);
	} 
}