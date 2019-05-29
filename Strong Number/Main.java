import java.util.Scanner;
/*class FFT
{
  int p,fact=1;
  public int F(int m)
  {
    for(p=1;p<=m;p++)
    {
      fact=fact*p;
    }
    return fact;
  }
}*/
class Main{
  static public int F(int m)
  {
    int fact=1;
    for(int p=1;p<=m;p++)
    {
      fact=fact*p;
    }
    return fact;
  }
	public static void main (String[] args){
	    // Type your code here
      //FFT ft=new FFT();
      Scanner sc= new Scanner(System.in);
      int n,m,match,i,sum=0;
      n=sc.nextInt();
      m=n;
      match=n;
      while(n!=0)
      {
        m=m%10;
        sum=sum+Main.F(m);
        n=n/10;
        m=n;
      }
      if(match==sum)
      {
      System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
	}
}