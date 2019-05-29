import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,i,j,k;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
          for(j=1;j<=n;j++)
          {
          if((j==1||j==n)&&(i!=1||i!=n))
          {
             System.out.print("*");
          }
            else if(i==1 ||i==n)
            {
              System.out.print("*");
            }
          else{
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }

	}
}