import java.applet.*;
import java.awt.*;
/*<applet code="DrawLine" width=400 height=400> </applet>*/
public class DrawLine extends Applet
{
    int width,height;
    public void init()
    {
        width=getSize().width;
        height=getSize().height;
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        for(int i=0;i<10;i++){
            g.drawLine(width,height,i*width/10,0);
        }
    }
}
