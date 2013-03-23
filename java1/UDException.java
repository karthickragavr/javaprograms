import java.io.*;
import java.lang.*;
class AgeException extends Exception
       {
          int age;
          AgeException(int a)
                   {
                     age=a;
                    }
           public String toString()
                              {
                               return("AgeException: "+age+" is less than 18; Not Eligible to vote.");
                              }
        }
        
class voter
        {
           void vote(int a)throws AgeException
                 {
                    if(a>=18)
                      { System.out.println("Eligible to vote");
                       }
                     else
                         {
                           AgeException e=new AgeException(a);
                           throw(e);
                          }
                  }
         }
class invoke
       {
          public static void main(String args[])throws IOException
                             { DataInputStream d=new DataInputStream(System.in);
                                System.out.print("Enter the age: ");
                                int x;
                                x=Integer.parseInt(d.readLine());  
                                voter v= new voter();
                                  try
                                      {
                                         v.vote(x);
                                       }
                                   catch(AgeException ae)
                                        {
                                           System.out.println(ae);
                                         }      
                             }
       }