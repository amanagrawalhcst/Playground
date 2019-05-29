import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n,i,max,pos;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    max=a[0];
    pos=0;
    for(i=1;i<n;i++)
    {
     if(a[i]>max)
     {
       max=a[i];
       pos=i;
     }
    }
      System.out.println(pos);
  }
}