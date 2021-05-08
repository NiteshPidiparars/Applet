import javax.swing.*;
public class SliderExample extends JFrame
{
    SliderExample()
    {
        JSlider s=new JSlider(JSlider.HORIZONTAL,0,50,25);
        s.setMinorTickSpacing(2);
        s.setMajorTickSpacing(10);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        JPanel p=new JPanel();
        p.add(s);
        add(p);
    }
    public static void main(String[]args)
    {
        SliderExample sl=new SliderExample();
        sl.pack();
        sl.setVisible(true);
    }
}
