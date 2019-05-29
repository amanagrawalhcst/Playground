import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n,i,j,h,temp;
    n = sc.nextInt();
    int a[] = new int[n];
    for(i = 0;i < n; i++)
    {
      a[i] = sc.nextInt();  
    }
    h=n/2;
    for(i=0;i<h-1;i++)
    {
      for(j=0;j<h-1;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
      for(i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
  }
}