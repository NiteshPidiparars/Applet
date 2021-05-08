import java.awt.*;
import java.applet.*;
/*<applet code="UsingParam" width=300 height=300> </applet>*/
public class UsingParam extends Applet
{
    public void paint(Graphics g)
    {
        String str=getParameter("msg");
        g.drawString(str,50,25);
    }
}
