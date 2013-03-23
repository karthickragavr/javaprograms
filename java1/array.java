import java.lang.*;
import java.io.*;
class readarray
{
 public static void main(String z[])throws IOException
   { int size;
     DataInputStream d=new DataInputStream(System.in);
     System.out.print("\nEnter the size of the array..."); 
     size=Integer.parseInt(d.readLine());
     int a[]=new int [size];
     for(int i=0;i<size;i++) 
      {
       System.out.print("\nEnter the VALUE=");
       a[i]=Integer.parseInt(d.readLine());
       }
    }
} 