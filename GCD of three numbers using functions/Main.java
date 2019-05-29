import java.util.Scanner;
class Main
{
public static int gcd1(int x,int y)
{
  if(x==y)
  {
    return x;
  }
  if(x>y)
  {
    return gcd1(x-y,y);
  }
   if(y>x)
  {
    return gcd1(x,y-x);
  }    
return 0;
}
  public static int gcd2(int x,int y)
{
  if(x==y)
  {
    return x;
  }
  if(x>y)
  {
    return gcd2(x-y,y);
  }
   if(y>x)
  {
    return gcd2(x,y-x);
  }    
return 0;
}
	public static void main (String[] args)
    {
      int n1,n2,n3,m1,m2;
	 Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      m1=Main.gcd1(n1,n2);
      m2=Main.gcd1(m1,n3);
      System.out.println(m2);
    }
}