import java.awt.*;
import javax.swing.*;
public class ProgressBarExample
{
    JProgressBar pb;
    int i=0,num=0;
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ProgressBarExample");
        f.setBounds(250,200,400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pb=new JProgressBar(0,2000);
        pb.setBounds(50,100,150,30);
        pb.setValue(0);
        pb.setStringPainted(true);
        f.add(pb);
        pb.iterat();
    }
    public void iterat()
    {
        while(i<=2000){
            pb.setValue(i);
            i=i+20;
        }
        try{
            Thread.sleep(250);
        }
        catch(Exception e){}
    }
}
