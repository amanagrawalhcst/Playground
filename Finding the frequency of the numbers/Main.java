import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int n,k,i,j;
      n=sc.nextInt();
      k=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[k+1];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<=k;i++)
      {
        b[i]=0;
      }
       for(i=0;i<n;i++)
      {
       int index=a[i];
         b[index]++;
      }
       for(i=1;i<=k;i++)
      {
        System.out.println(i+" "+b[i]);
      }
        
    }
}