import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int n,k,i,j,temp;
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      k=sc.nextInt();
      for(i=0;i<n-1;i++)
      {
        for(j=0;j<n-i-1;j++)
        {
          if(a[j+1]>a[j])
          {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
      }
      System.out.println(a[k-1]);
    }
}