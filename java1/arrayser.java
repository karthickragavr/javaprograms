import java.lang.*;
import java.io.*;
class search
{
 public static void main(String z[])throws IOException
   { int size,key;
      int repeat=0;
     DataInputStream d=new DataInputStream(System.in);
     System.out.print("\nEnter the size of the array..."); 
     size=Integer.parseInt(d.readLine());
     int a[]=new int [size];
     for(int i=0;i<size;i++) 
      {
       System.out.print("\nEnter the VALUE=");
       a[i]=Integer.parseInt(d.readLine());
       }
     System.out.print("\nEnter the SEARCH KEY..");
     key=Integer.parseInt(d.readLine());
    
     for(int i=0;i<size;i++) 
        { 
          if(a[i]==key)
           { System.out.println("KEY="+key+" is found at the index position "+i+" of the array.");
              repeat++;
           }
        }
    System.out.println("KEY="+key+" was found "+repeat+" times in the array.");
     
    } 
}