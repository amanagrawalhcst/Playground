import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s1,s2;
      int i,len,index;
      s1=sc.nextLine();
      s2=sc.nextLine();
      //StringBuilder str1=new StringBuilder(s1);
      //StringBuilder str1=new StringBuilder(s);
      s1=s1.concat(s1);
      if(s1.contains(s2)==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}