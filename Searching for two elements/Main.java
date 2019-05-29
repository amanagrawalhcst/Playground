import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a[]=new int[1000];
      Scanner sc=new Scanner(System.in);
      int n,i,n1,n2,m1=-1,m2=-1;
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
     n1=sc.nextInt();
     n2=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==n1)
        {m1=i;}
        if(a[i]==n2)
        {
          m2=i;
        }
      }
      System.out.println(m1);
      System.out.println(m2);
    }
}