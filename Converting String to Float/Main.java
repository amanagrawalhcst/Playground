import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int len,i,n=0,p,point=0,n1=0;
    double d;
    String str;
    str=sc.nextLine();
    len=str.length();
      for(i=len-1;i>=0;i--)
    {
      if(str.charAt(i)!='.')
      {
      point++;
      }
        else
        {
          break;
        }
    }
   for(i=0;i<len;i++)
    {
      if(str.charAt(i)!='.')
      {
      p=(int)(str.charAt(i)-48);
      n=n*10+p;
      }
    }
  if((len-point)>0)
    {
      n1=(int)Math.pow(10,point);
      d=(double)n/n1;
    System.out.printf("%.6f",d);
   }
    else
    {
      d=n;
      System.out.printf("%.6f",d);
    }
    
  }
}