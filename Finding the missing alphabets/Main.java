import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s;
      int i,len,index;
      char ch;
      int a[]=new int[100];
      s=sc.nextLine();
      StringBuilder str1=new StringBuilder(s);
      for(i=0;i<=32;i++)
      {
        a[i]=0;
      }
      len=str1.length();
      for(i=0;i<len;i++)
      {
        if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
        {
          index=str1.charAt(i)-'a';
          a[index]++;
        }
        else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')
        {
          index=str1.charAt(i)-'A';
          a[index]++;
        }
      }
      for(i=0;i<=25;i++)
      {
        if(a[i]==0)
        {
          ch=(char)(i+97);
          System.out.print(ch+" ");
        }
      }
    } 
}