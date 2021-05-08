import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="ContextApplet" width=300 height=400> </applet>*/
public class ContextApplet extends Applet implements ActionListener
{
    Button b;
    public void init()
    {
        b=new Button("OK");
        b.setBounds(50,100,100,50);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        AppletContext ap=getAppletContext();
        Applet a=ap.getApplet("app2");
        a.setBackground(Color.yellow);
    }
}
