import java.lang.*;
import java.io.*;

  class mainc
  {  
     
        
        int bt[],mt[],mca[];
        int tot;
        static int sum;
        private int mba[];
     mainc()throws IOException         
     {
       DataInputStream d=new DataInputStream(System.in);
      bt[ ] = new bt[4];
      mt[ ] = new mt[2];
      mca[ ] = new mca[3];
      mba[ ] = new mba[2];
       
      System.out.println("\nenter the strenght in B.tech");
      for(int i=0;i<4;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           bt[i]=Integer.parseInt(d.readLine());
           tot=bt[i]+tot;
         }   
      
      System.out.println("\nEnter the strenght in M.tech");
      for(int i=0;i<2;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           mt[i]=Integer.parseInt(d.readLine());
           tot=mt[i]+tot;
         }
            
      System.out.println("\nEnter the strenght in MCA");
      for(int i=0;i<3;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           mca[i]=Integer.parseInt(d.readLine());
           tot=mca[i]+tot;
         }  
            
      System.out.println("\nenter the strenght in MBA");
      for(int i=0;i<2;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           mba[i]=Integer.parseInt(d.readLine());
           tot=mba[i]+tot;
         } 
         
      }  
 }
  
   class src extends mainc
   {
     int bca[],bba[],bsc[],bcom[],msc[];
     src()throws IOException
     {   
         bca[]=new bca[3];
         bba[]=new bba[3];
         bsc[]=new bsc[3];
         bcom[]=new bcom[3];
         msc[]=new msc[2];
                
      System.out.println("\nenter the strenght in BCA");
      for(int i=0;i<3;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           bca[i]=Integer.parseInt(d.readLine());
           tot=bca[i]+tot;  
          }   
      System.out.println("\nenter the strenght in BBA");
      for(int i=0;i<3;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           bba[i]=Integer.parseInt(d.readLine());
           tot=bba[i]+tot; 
           }    
      System.out.println("\nenter the strenght in Bsc");
      for(int i=0;i<3;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           bsc[i]=Integer.parseInt(d.readLine());
           tot=bsc[i]+tot; 
        }     
               
      System.out.println("\nenter the strenght in BCOM");
      for(int i=0;i<3;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           bcom[i]=Integer.parseInt(d.readLine());
           tot=bcom[i]+tot;
         }
              
      System.out.println("\nenter the strenght in Msc");
      for(int i=0;i<2;i++)
        { 
          System.out.println("in "+(i+1)+"-year..");
           msc[i]=Integer.parseInt(d.readLine());
           tot=msc[i]+tot;
       } 
   }

class invoke
  { 
    public static void main(String arg[])throws IOExcetion
       {
          mainc t= new mainc();
          src k=new src();
          System.out.println("Total strength in Vallam campus="+t.tot);
          System.out.println("Total strength in Src campus="+k.tot);
          System.out.println("Total stenght in both the campus="+(t.tot+k.tot));
        }
   }

