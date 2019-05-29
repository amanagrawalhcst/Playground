import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      int i,n,max=0,sum=0;
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          if(sum>max)
          {
            max=sum;
          }
          sum=0;
        }
        else
        {
          sum++;
        }
      }
     System.out.println(max); 
    }
}