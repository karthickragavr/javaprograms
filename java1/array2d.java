import java.lang.*;
import java.io.*;
class array
{
 public static void main(String z[])throws IOException
{ 
 int a[][]=new int  [3][];
 a[0]=new int [1]; 
 a[1]=new int [2];
 a[2]=new int [3];
 DataInputStream d=new DataInputStream(System.in);
 for(int i=0;i<3;i++)
 { for(int j=0;j<=i;j++)
    { a[i][j]=j+1;
     System.out.print(a[i][j]);
      }
   System.out.println();
  }
} 
}