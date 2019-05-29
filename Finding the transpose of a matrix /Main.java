import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
   Scanner sc=new Scanner(System.in);
    int i,j,r,c;
    r=sc.nextInt();
    c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[c][r];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
     for(i=0;i<c;i++)
    {
      for(j=0;j<r;j++)
      {
        b[i][j]=a[j][i];
      }
    }
     for(i=0;i<c;i++)
    {
      for(j=0;j<r;j++)
      {
        System.out.print(b[i][j]+" ");
      }
       System.out.print("\n");
    }
  }
}