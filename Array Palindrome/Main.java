import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int n,i,j=0;
      n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=n-1;i>=0;i--)
      {
        b[j]=a[i];
        j++;
      }
      if(Arrays.equals(a,b))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}