import java.applet.*;
import java.awt.*;
/*<applet code="ThreadAppletDemo.class" width="400" height="400"> </applet>*/
public class ThreadAppletDemo extends Applet
{
    public void paint(Graphics g)
    {
        for(int i=0;i<10;i++)
        {
            g.drawString(String.valueOf(i),200+(i*10),200);
        try
    {
        Thread.sleep(2000);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        }
    }
}
