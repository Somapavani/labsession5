import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code ="MEApplet" width=300 height =300>
//</applet>
public class MEApplet extends Applet implements MouseListener
{
public void init()
 {
  add MouseListener();
}
  public void mouseClicked(MouseEvent me)
  {
   setBackground(color.yellow);
   repaint();
  } 
   public void mouseExited(MouseEvent me)
  {
   setBackground(color.blue);
   repaint();
  } 

    public void mousePressed(MouseEvent me)
  {
   setBackground(color.green);
   repaint();
  } 
  public void mousePressed(MouseEvent me)
{
}
 public void mouseReleased(MouseEvent me)
{
}
}  