import java.applet.*;
import java.awt.*;
/*<applet code="FaceApplet" width=500 height=500> </applet>*/
public class FaceApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(50,50,200,200);
        g.fillOval(100,100,25,25);
        g.drawOval(100,100,25,25);
        g.drawOval(180,100,25,25);
        g.fillOval(180,100,25,25);
        g.drawArc(110,170,90,50,200,150);
    }
}
