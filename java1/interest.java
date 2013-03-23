import java.lang.*;
import java.io.*;

class interest
  {
    int p,n;
    float r;
    double I;
    interest(int x,int y,float z)
     {
       p=x; n=y; r=z;
     }
    void disp()
    {
      System.out.println("\nP="+p+"\nn="+n+"\nr="+r+"\nInterest Amt="+I);
    }
  }
 class si extends interest
  {
            si(int x,int y,float z)
             {  
               super(x,y,z);
               System.out.println("\nSimple Interest");
             }
            void calc()
             {
               I=p*n*r/100;  
              } 
   }
 class ci extends interest
  {
    
        ci(int x,int y,float z)
         {
           super(x,y,z);
           System.out.println("\nCompound Interest");
          }
         void calc()
           {
               I=(int)p*Math.pow((1+r/100),n);  
            } 
   }
  
  class invoke
   {
     public static void main(String args[])throws IOException
       {
         DataInputStream d=new DataInputStream(System.in);
         System.out.print("\nEnter the Principal amt="); 
         int a,b;
         float c;
         a=Integer.parseInt(d.readLine());
         System.out.print("\nEnter the No.of yrs=");
         b=Integer.parseInt(d.readLine());
         System.out.print("\nEnter the rate of interest=");
         c=Float.parseFloat(d.readLine());
         si ob1=new si(a,b,c);
         ob1.calc();
         ob1.disp();
         ci ob2=new ci(a,b,c);
         ob2.calc();
         ob2.disp();   
         
       }
    }