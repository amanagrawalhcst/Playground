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
            if(j==n&&i%2==1)
            {
              System.out.print(i+1);
            }
          else if(j==1&&i%2==0){
            System.out.print(i+1);
          }
            else{
              System.out.print(i);
            }
        }
        System.out.print("\n");
      }

	}
}