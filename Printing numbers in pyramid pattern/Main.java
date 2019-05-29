import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       int n,i,j,k,num=1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(k=1;k<=i;k++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.print("\n");
      }
    }    
}