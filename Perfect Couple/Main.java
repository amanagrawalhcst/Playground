import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n,i,j,value;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    value=sc.nextInt();
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if((a[i]+a[j])==value)
        {
          System.out.println(a[i]+", "+a[j]);
        }
      }
    }
   
  }
}