import java.awt.*;
import javax.swing.*;
public class TabbedPane extends JFrame
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("TabbedPane");
        f.setBounds(250,150,400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea tf=new JTextArea(200,200);
        JPanel p1=new JPanel();
        p1.add(tf);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tb=new JTabbedPane();
        tb.setBounds(70,50,200,200);
        tb.add("main",p1);
        tb.add("visit",p2);
        tb.add("help",p3);
        f.add(tb);
    }
}
