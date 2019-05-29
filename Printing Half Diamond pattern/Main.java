import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n,i,j,k;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(k=1;k<=(2*i-1);k++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}