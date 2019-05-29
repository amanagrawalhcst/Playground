import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s;
      StringBuilder str2=new StringBuilder();
      int i,len,j=0,check=1;
      s=sc.nextLine();
      StringBuilder str1=new StringBuilder(s);
      len=str1.length();
      for(i=len-1;i>=0;i--)
      {
        str2.append(str1.charAt(i));
      }
      for(i=0;i<len-1;i++)
      {
        if(str1.charAt(i)!=str2.charAt(i))
        {
          check=0;
        }
      }
      if(check==1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}