import java.awt.*;
import java.applet.*;
/*<applet code="JavaApp" width="500" height="500"> </applet>*/
public class JavaApp extends Applet
{
     int i;
     public void paint(Graphics g)
     {
         g.drawString("i= "+i,100,100);
         try
         {
             Thread.sleep(100);
         }
         catch(InterruptedException e){}
         i++;
         repaint();
     }
}
