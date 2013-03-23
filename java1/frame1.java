import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Fire extends Frame implements Action Listener
      {  
         String m;
         
         Fire()
          { 
            Button b=new Button("Ok");add(b);
            b.addactionListener(this);Textfield t=new Textfield(String txt);add(t);
          }
         public void actionPerformed(ActionEvent e) 
           {
                if(e.getSource==b)
                    {
                      Frame f2=new Frame();
                      f2.set
                      f2.setVisible();
                       
                    }            
           }
      }