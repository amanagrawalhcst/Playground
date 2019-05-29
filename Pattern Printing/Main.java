import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int r,c,i,j;
      r=sc.nextInt();
      c=sc.nextInt();
      for(i=r;i>=1;i--)
      {
        for(j=c;j>=1;j--)
        {
          if(j==i ||j<i)
          {
            System.out.print(i);
          }
          else
          {
            System.out.print(j);
          }
        }
        System.out.print("\n");
      }
}
}