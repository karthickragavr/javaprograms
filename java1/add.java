import java.lang.*;
import java.io.*;

class add
  { 
    int a,b;
     add()throws IOException
     { DataInputStream d=new DataInputStream(System.in);
       System.out.println("\nEnter the two inputs..");
        a=Integer.parseInt(d.readLine());
        b=Integer.parseInt(d.readLine());  
       System.out.println("\nAns="+(a+b));
      }
     public static void main(String arg[])throws IOException 
      {
            add a= new add();     
       }
  }