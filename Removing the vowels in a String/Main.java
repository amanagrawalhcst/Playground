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
    StringBuilder str2=new StringBuilder();
    str=sc.nextLine();
    len=str.length();
   for(i=0;i<len;i++)
    {
      if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
      {
      str2.append(str.charAt(i));
      }
    }
  
   System.out.println(str2); 
  }
}