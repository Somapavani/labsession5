import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code ="CBApplet" width=300 height =300>
//</applet>
{
public class CBApplet extends Applet implements ActionListener ItemListener{
 Choice c;
 public void init()
 {
 Label l = new Label("Select any one Item");
 c= new Choice();
 c.add("Red");
 c.add("Green");
 c.add("Blue");
 c.addItemListener(this);
 add(l);
 add(c);
 }
 public  void itemstatechanged(ItemEvent ae)
 {
  String s=c.getSelectedItem();
  if(s.equals("Red"))
  setBackground(color.red);
  else 
  if(s.equals("Green"))
  setBackground(color.Green);
  else
  setBackground(color.Blue);
  repaint();
 }
}
