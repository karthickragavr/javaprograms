class sampthr extends Thread
       {
         String msg;
         sampthr(String msg)
                    {
                        this.msg=msg;
                     }
          public void run()
                     {
                       for(int i=0;i<10;i++)
                             {
                               System.out.println(msg);
                                try
                                     { 
                                       Thread.sleep(1000);
                                      }
                                 catch(Exception e){ }
                              }
                       } 
            
        }
 class invoke
        {
           public static void main(String args[])
                              {
                                  sampthr s=new sampthr("one");
                                  s.start();
                                  sampthr s1=new sampthr("two");
                                  s1.start();
                                  for(int i=0;i<10;i++)
                                       {
                                        System.out.println("MAIN");
                                        }                       
                               }
         }