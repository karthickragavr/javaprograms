import java.lang.*;
import java.io.*;

class sort
{
  sort()
 {
 }
  void dosort(int a[])
  {  int size=a.length;
   for( int i=0;i<=size-2;i++)
    { for(int j=i+1;j<=size-1;j++)
       { if(a[i]>a[j])
         { int t;
          t=a[i];
          a[i]=a[j];
          a[j]=t;   
          }
        }  
     }  
  }
 void dosort(String a[])
   { int size=a.length;
    for( int i=0;i<=size-2;i++)
    { for(int j=i+1;j<=size-1;j++)
       { 
         if(a[i].compareTo(a[j])>0)
          {String t;
           t=a[i];
           a[i]=a[j];
           a[j]=t; 
           }  
         }
      }
    }

public static void main(String z[])throws IOException
{  int c;
   int n,m;
   int a[]; String s[];
   sort o= new sort();
   DataInputStream d= new DataInputStream(System.in);  
 
do
{
   System.out.print("\n\n1.StringSort\n2.IntSort\n3.Exit\nEnter your choice:");
  
    c=Integer.parseInt(d.readLine());
    
 switch(c)
   {case 1:
             System.out.println("\n StringSorting\n");
             System.out.println("Enter the size of String array");
             m=Integer.parseInt(d.readLine());
             s= new String[m];
             System.out.println("Enter "+m+" elements");
             for(int i=0;i<m;i++) 
              { s[i]=d.readLine();
               }
              o.dosort(s);
              System.out.print("\n Sorted O/P :\n");
              for(int i=0;i<m;i++) 
              { System.out.println(s[i]);
               }
             break;
  case 2:
             System.out.println("\n IntSorting\n");
             System.out.println("Enter the size of Int array");
             n=Integer.parseInt(d.readLine());
             a= new int[n];
             System.out.println("Enter "+n+" elements");
             for(int i=0;i<n;i++) 
              { a[i]=Integer.parseInt(d.readLine());
               }
              o.dosort(a);
              System.out.print("\n Sorted O/P :\n");
              for(int i=0;i<n;i++) 
              { System.out.println(a[i]);
               }
             break;
       case 3:  System.exit(0);break;
  default: System.out.println("Invalid input.. try to give inputs from 1 to 3.");

  }
}while(true);   

}
}