import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    int len,i;
    String str = sc.nextLine();
    StringBuilder str2 = new StringBuilder();
    String ch[]=str.split(" ");
    for(String a:ch)
    {
      str2.append(a);
      str2=str2.reverse();
      System.out.print(str2+" ");
      str2.setLength(0);
    }
   
  }
}