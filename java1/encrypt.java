import java.io.*;
import java.lang.*;

class invoke
     {
         DataInputStream d=new DataInputStream(System.in);
         System.out.println("Enter the String that you want to cypher..."); 
         String s;
         s=d.readLine();
         int n;
         n=s.length();
         private int k=5;
         for(int i=0;i<n;i++)
              {
                if((s.charAt(i)+k)>90)
                    {
                        s+=((s.charAt(i)+k)-90)+64);
                     }
                else
                    {
                        s+=s.charAt(i)+k ;
                    }
               }         
 
      }  