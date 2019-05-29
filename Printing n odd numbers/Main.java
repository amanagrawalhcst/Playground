import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
           Scanner sc= new Scanner(System.in);
      int n,i,m=1,j;
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=m;true;j++)
        {
        if(j%2==1)
        {
          System.out.println(j);
          m=j+1;
          break;
        }
        }
      }
	}
}