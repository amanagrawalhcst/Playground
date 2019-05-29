import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      int i,n,count=0,sum=0,index,j,num;
      n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[10];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
       for(i=0;i<10;i++)
      {
        b[i]=0;
      }
      for(i=0;i<n;i++)
      {
        index=a[i];
        b[index]++;
      }
      count=b[a[0]];
        num=a[0];
      for(i=1;i<n;i++)
      {
         if(b[a[i]]>count)
         {
           count=b[a[i]];
           num=a[i];
         }
      }
     System.out.println(num); 
    }
}