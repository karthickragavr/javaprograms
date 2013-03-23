import java.io.*;
import java.lang.*;
class Sparse
{
 public static void main(String a[])throws IOException
{
  DataInputStream d=new DataInputStream(System.in);
  int b[][];
  int count=0;
  int flag=0;
  int n,m;
  System.out.println(" Enter the number of elements");
  n=Integer.parseInt(d.readLine());
  m=Integer.parseInt(d.readLine());
   b=new int[n][m];
   System.out.println(" Please enter the array of elements");
   for( int i=0;i<n;i++)
    {
     for( int j=0;j<m;j++)
      {
      b[i][j]=Integer.parseInt(d.readLine());  
      }
    } 
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
   {
    if(b[i][j]==0)
    count++;
    else
    flag++;
   }
  }
 if(count>flag) 
  {System.out.println("It is a sparse matrix");}  
  else
   {System.out.println("Its a dense matrix");}
}
}