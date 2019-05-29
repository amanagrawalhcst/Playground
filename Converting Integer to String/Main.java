import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    int n,rev=0,temp,count=0,l,i=0;
    char ch1;
    n=sc.nextInt();
    temp=n;
    if(temp<0)
    {
      temp=temp*(-1);
    }
    while(temp>0)
    {
      l=temp%10;
      rev=rev*10+l;
      temp=temp/10;
      count++;
    }
    char ch[]=new char[count];
    while(rev>0)
    {
      l=rev%10;
      ch1=(char)(l+48);
      ch[i]=ch1;
      i++;
      rev=rev/10;
    }
    if(n<0)
    {
      System.out.print("-");
      for(i=0;i<count;i++)
      {
        System.out.print(ch[i]);
      }
    }
    else
    {
      for(i=0;i<count;i++)
      {
        System.out.print(ch[i]);
      }
    }
  }
}