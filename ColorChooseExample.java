import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ColorChooseExample extends JFrame implements ActionListener
{
    JFrame f;
    Container c;
    JButton btn;
    ColorChooseExample()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        btn=new JButton("Color");
        btn.addActionListener(this);
        c.add(btn);
    }
    public void actionPerformed(ActionEvent e)
    {
        Color initcolor=Color.RED;
        Color cl=JColorChooser.showDialog(this,"Select a Color",initcolor);
        c.setBackground(cl);
    }
    public static void main(String[]args)
    {
        ColorChooseExample ch=new ColorChooseExample();
        ch.setBounds(250,150,400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
