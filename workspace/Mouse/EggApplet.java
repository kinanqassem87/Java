// using inner class
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
 import java.awt.geom.*;
 public class EggApplet extends Applet
 {
 private Ellipse2D.Double egg;
 private static final double EGG_WIDTH = 30;
 private static final double EGG_HIGHT = 50;
 public EggApplet()
 {
 egg = new Ellipse2D.Double(0,0,EGG_WIDTH, EGG_HIGHT);
 // add mouse click listener
 MouseClickListener listener = new MouseClickListener();
 addMouseListener(listener);
 }
 public void paint(Graphics g)
 {
 Graphics2D g2 = (Graphics2D)g;
 g2.draw(egg);
 }

 // inner class definition

 private class MouseClickListener extends MouseAdapter
 {public void mouseClicked(MouseEvent event)
 {
	 int mouseX=event.getX();
	 int mouseY=event.getY();
	 // now move the ellipse to (mouseX, MouseY)
	 egg.setFrame(mouseX-EGG_WIDTH/2, mouseY-EGG_HIGHT/2,
	 EGG_WIDTH, EGG_HIGHT);
	 repaint();
	 }
	 }
	 }