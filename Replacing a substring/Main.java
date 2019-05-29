import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s1,s2,s3;
      int i,len,index;
      s1=sc.nextLine();
      s2=sc.nextLine();
      s3=sc.nextLine();
      s1=s1.replace(s2,s3);
        System.out.println(s1);
    } 
}