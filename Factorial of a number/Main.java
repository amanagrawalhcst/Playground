import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc= new Scanner(System.in);
      int n,i,fact=1;
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
          System.out.println(fact);
	}
}