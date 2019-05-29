import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n,i,j,t=1;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        if(t%2==1){
      System.out.print("*");}
        else{
          System.out.print("#");}
        t++;
      }
      System.out.print("\n");
    }
    }
}