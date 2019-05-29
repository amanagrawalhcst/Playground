import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String str;
    int key,i,len,val,q;
    char ch;
    str=sc.nextLine();
    key=sc.nextInt();
    StringBuilder str2=new StringBuilder(str);
    len=str2.length();
    for(i=0;i<len;i++)
    {
      if(str2.charAt(i)>='A' && str2.charAt(i)<='Z')
      {
        val=(int)str2.charAt(i)-'A';
        if(val-key>=0)
        {
          val=val-key;
        }
        else
        {
          q=key-(val+1);
          val=25-q;
        }
        ch=(char)('A'+val);
        str2.setCharAt(i,ch);
      }
      else if(str2.charAt(i)>='a' && str2.charAt(i)<='z')
      {
        val=(int)str2.charAt(i)-'a';
        if(val-key>=0)
        {
          val=val-key;
        }
        else
        {
          q=key-(val+1);
          val=25-q;
        }
        ch=(char)('a'+val);
        str2.setCharAt(i,ch);
      }
    }
    System.out.println(str2);
  }
}