import java.lang.*;
import java.io.*;

class matcrypt
{          String a;
           int m;
           char c[][];           
           matcrypt(String wrd,int sq)
           {
                     a=wrd;
                     m=(int)Math.sqrt(sq);
                      if(sq!=(m*m))
                        {
                          m=m+1; 
                         }
                      else
                         {
                           m=m;
                          }
                     c=new char[m][m];   
           }
        


           void crypt()
                {     
                      
                      for(int i=0;i<m;i++)
                         { for(int j=0;j<m;j++)
                                {  if(i==0)
                                    {  if((a.charAt(j))==(char)"")
                                         { 
                                           c[j][i]=(char)"*";                                            
                                          }

                                       else{
                                       c[j][i]=(char)(a.charAt(j));}
			
                                     }
                                   if(i==1)
                                    { if((a.charAt(3+j))==(char)"")
                                         { 
                                           c[j][i]=(char)"*";                                            
                                          }

                                       else{
                                      c[j][i]=(char)(a.charAt(3+j));}
                                        
                                    }
                                   if(i==2)
                                    {if((a.charAt(j))==(char)" ")
                                         { 
                                           c[j][i]=(char)"*";                                            
                                          }

                                       else{
                                      c[j][i]=(char)(a.charAt(6+j));}
                                                                           }
                                }
                            }
                     }

                     void decrypt()   
                     {   
                           for(int i=0;i<m;i++)
                            {   for(int j=0;j<m;j++)
                                  {
                                    System.out.print(c[i][j]);                       
                                  }
                             }
                       System.out.println("");
                }
}       
   
class invoke
        {  
                  public static void main(String args[])throws IOException
                       {
                           DataInputStream d=new DataInputStream(System.in);
                           System.out.println("Enter the String that you want to cypher..."); 
                           String s;
                          
                           s=d.readLine();
                           int n;
                           n=s.length();
                           matcrypt X=new matcrypt(s,n); 
                           X.crypt();
                           X.decrypt();      
                            
                          
                       }
           }