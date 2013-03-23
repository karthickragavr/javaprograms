import java.io.*;
import java.lang.*;
class poly
{
	DataInputStream d=new DataInputStream(System.in);
	int coef[];
	poly(int n)throws IOException
                {               coef=new int[n+1];
		for(int i=0;i<=n;i++)
		{ coef[i]=0;
                                     }	
                  }
	void get(int n)throws IOException
	{
		
		
		for(int i=0;i<=n;i++)
		{ System.out.print("\nEnter the integer coefficients=");
                                      coef[i]=Integer.parseInt(d.readLine());
                                     }	
                  }

	poly add(poly ob,int n)throws IOException
	{                poly temp;
		temp=new poly(n);
		for(int i=0;i<=n;i++)
		{	temp.coef[i]=coef[i]+ob.coef[i];	}	
		return(temp);	
	}	
	void disp(int n)
	{	
		int x=n;
		for(int i=0;i<=n;i++,x--)
		{
			System.out.print(" "+coef[i]+"x^"+x);
		}
	                 System.out.println();
                }
	public static void main(String args[])throws IOException
	{                int n;
                                    poly p1,p2,p3;
	
                          	DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the heighest degree");
		 n=Integer.parseInt(d.readLine());
		System.out.println("Enter the 1st polynomial");
                                   p1=new poly(n);
                                    p1.get(n);
		System.out.println();
                                  System.out.println("Enter the 2nd polynomial");
		 p2=new poly(n);
                                    p2.get(n); 
                                   p3=p1.add(p2,n);
		
                                  p1.disp(n);
		
                                p2.disp(n);
                                  
	               p3.disp(n);
	}
}