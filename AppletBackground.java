import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*<applet code="AppletBackground" width=300 height=400> </applet>*/
public class AppletBackground extends Applet implements AdjustmentListener
{
    Scrollbar s1,s2,s3;//js_red,js_green,js_blue
    Label l1,l2,l3;//lbl_red,lbl_green,lbl_blue
    Color c;
    public void init()
    {
        s1=new Scrollbar(Scrollbar.HORIZONTAL,10,2,0,256);
        s2=new Scrollbar(Scrollbar.HORIZONTAL,10,2,0,256);
        s3=new Scrollbar(Scrollbar.HORIZONTAL,10,2,0,256);

        l1=new Label("Red "+"0");
        l2=new Label("Green "+"0");
        l3=new Label("Blue "+"0");

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);

        s1.setBounds(20,20,150,20);
        s2.setBounds(20,50,150,20);
        s3.setBounds(20,80,150,20);
        l1.setBounds(190,20,75,20);
        l2.setBounds(190,50,75,20);
        l3.setBounds(190,80,75,20);

        Panel p=new Panel();
        p.setLayout(null);
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.setBounds(20,20,250,120);
        this.add(p);
    }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
        l1.setText("Red "+s1.getValue());
        l2.setText("Green "+s2.getValue());
        l3.setText("Blue "+s3.getValue());
    }
}
