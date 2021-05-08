import javax.swing.*;
public class Slider extends JFrame
{
    Slider()
    {
        JFrame f=new JFrame("Slider");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider s=new JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel p=new JPanel();
        p.add(s);
        f.add(p);
    }
    public static void main(String[]args)
    {
        Slider sl=new Slider();
        sl.pack();
        sl.setVisible(true);
    }
}
