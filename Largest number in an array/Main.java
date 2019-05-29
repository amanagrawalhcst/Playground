import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a[]=new int[1000];
      Scanner sc=new Scanner(System.in);
      int n,i,max;
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      max=a[0];
      for(i=1;i<n;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
        }
      }
      System.out.println(max);
    }
}