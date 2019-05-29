import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int n,i,index;
      n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n+1];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      b[0]=0;
      for(i=1;i<=n;i++)
      {
        b[i]=1;
      }
      for(i=0;i<n;i++)
      {
        index=a[i];
        b[index]--;
      }
      for(i=1;i<=n;i++)
      {
        if(b[i]==1)
        {
          System.out.println(i);
        }
      }
    }
}