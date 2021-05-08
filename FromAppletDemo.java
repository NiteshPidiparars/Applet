import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="FromAppletDemo" width=400 height=400> </applet>*/
public class FromAppletDemo extends Applet implements ActionListener
{
    Label entername;
    TextField name;
    Label emailname;
    TextField email;
    Button click;
    Label result;
    public void init()
    {
        entername=new Label("Enter your name: ");
        name=new TextField(30);
        emailname=new Label("Enter your email: ");
        email=new TextField(30);
        click=new Button("Click Here");
        result=new Label();
        add(entername);
        add(name);
        add(emailname);
        add(email);
        add(click);
        add(result);
        click.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=name.getText();
        String p=email.getText();
        String n="";
        if(s.equals(n)||e.equals(n)){
            result.setText("please enter appropriate information.....");
        }
        else
        {
            result.setText("Welcome to programming hub..");
        }
    }
}
