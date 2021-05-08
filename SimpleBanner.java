import java.applet.*;
import java.awt.*;
/*<applet code="SimpleBanner" width="600" height="400"> </applet>*/
public class SimpleBanner extends Applet implements Runnable
{
    String str="This is a SimpleBanner";
    Thread t;
    boolean b;
    public void init()
    {
        setBackground(Color.gray);
        setForeground(Color.yellow);
    }
    public void start()
    {
        t=new Thread(this);
        b=false;
        t.start();
    }
    public void run()
    {
        char ch;
        for(;;){
            try
            {
                repaint();
                Thread.sleep(250);
                ch=str.charAt(0);
                str=str.substring(1,str.length());
                str=str+ch;
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g)
    {
        g.drawRect(1,1,300,150);
        g.setColor(Color.yellow);
        g.fillRect(1,1,300,150);
        g.setColor(Color.red);
        g.drawString(str,1,150);
    }
}
