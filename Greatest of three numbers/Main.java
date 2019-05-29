import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n1,n2,n3,max;
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      max=n1;
      if(n2>max)
      {
        max=n2;
      }
      if(n3>max)
      {
        max=n3;
      }
      System.out.println(max);
    }
}