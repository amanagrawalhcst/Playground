import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s1,s2;
      s1=sc.nextLine();
      s2=sc.nextLine();
      StringBuilder str1=new StringBuilder(s1);
      StringBuilder str2=new StringBuilder(s2);
      int i,len1,len2,j,k=0,count=0,p=0;
      len1=str1.length();
      len2=str2.length();
      for(i=0;i<=len1-len2;i++)
      {
        k=0;
        p=0;
        for(j=i;j<(i+len2);j++)
        {
          if(str1.charAt(j)==str2.charAt(k) && p<len2)
          {
            p++;
            k++;
            if(p==len2)
            {
              count++;
            }
          }
          else
          {
            p=0;
            k++;
          }
          
        }
      }
      System.out.println(count);
    } 
}