import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0,m=1,p;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    sum=a[0]+a[1]+a[2];
    p=sum;
    for(i=3;i<n;i=i+3)
    {
      sum=a[i]+a[i+1]+a[i+2];
      if(sum!=p)
      {
        m=0;
        break;
      }
      sum=0;
      
    }
    if(m==0)
    {
      System.out.println("Not a Perfect Batch");
    }
    else if(m==1)
    {
      System.out.println("Perfect Batch");
    }
    
  }
}