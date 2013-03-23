import Maths.*;
import java.lang.*;
import java.io.*;

class invoke
 {
   public static void main(String args[])throws IOException  
      {
        DataInputStream d=new DataInputStream(System.in);
        int x=0;
        int y=0;
        int n;
        op o=new op();
        do
         {  
           System.out.println("\nSelect any one OP: \n1.ADD\t2.SUB\t3.MUL\t4.DIV\t5.EXIT");
           n=Integer.parseInt(d.readLine());
           if(n!=5) 
             { 
               System.out.println("\nEnter the two i/ps..");
               x=Integer.parseInt(d.readLine());
               y=Integer.parseInt(d.readLine());
              }
                
             switch(n)
                 {
                   case 1: System.out.println("\nAns="+o.add(x,y));break; 
                   case 2:System.out.println("\nAns="+o.sub(x,y));break;
                   case 3:System.out.println("\nAns="+o.mul(x,y));break;
                   case 4:System.out.println("\nAns="+o.div(x,y));break;
                   case 5:  System.exit(0);break;
                  default: System.out.println("\nEnter any valid  i/p from 1 to 5.");
                  }     
               
          }while(true);
     }
 }