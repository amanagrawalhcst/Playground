import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
    Scanner sc=new Scanner(System.in);
    int n,i,j=0,k=0;
    n=sc.nextInt();
    int a[]=new int[n];
    int nz[]=new int[n];
    int z[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
      for(i=0;i<n;i++)
    {
      if(a[i]!=0)
      {
      nz[j]=a[i];
        j++;
      }
       else if(a[i]==0)
      {
      z[k]=a[i];
        k++;
      }
    }
      for(i=0;i<j;i++)
      {
        System.out.print(nz[i]+" ");
      }
     for(i=0;i<k;i++)
      {
        System.out.print(z[i]+" ");
      }
    }
}