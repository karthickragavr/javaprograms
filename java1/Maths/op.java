package Maths;

interface arith
 {
   int add(int a,int b);
   int sub(int a,int b);
   int mul(int a,int b);
   int div(int a,int b);
 }
 
public class op implements arith
  { 
    public op(){ }   
 
   public int add(int a,int b)
      { 
        return(a+b);
      }
   public int sub(int a,int b)
      { 
        return(a-b);
      }
  public int mul(int a,int b)
      { 
        return(a*b);
     }
 public int div(int a,int b)
      { 
        return(a/b);
      }
   }
  