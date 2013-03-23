//Passing objects as parameters to a method
import java.io.*;
import java.lang.*;
class height 
{   
    int ft; int in;
    height(int a, int b)
     { 
      ft=a; in=b;
     } 
    height add (height c) 
    { 
       height h;
       h=new height(0,0);
       h.ft=ft+c.ft;
       h.in=in+c.in;
       if(h.in>=12)
       {
         h.in-=12;
         h.ft+=1;
       }
        return(h);
     }
   void disp()
   { 
     System.out.println("Height is "+ft+"'"+in+"\" ");
   }
    public static void main(String Z[])throws IOException
    { 
      height h1,h2,h3;
      h1=new height(6,3);
      h2=new height(5,9);
      h3=h1.add(h2);
      h1.disp();
      h2.disp();
      h3.disp(); 
     }
} 