import javax.swing.*;
import java.awt.*;
public class Cos extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for(double i=10;i<100;i++)
		if(Math.cos(i)<1)
		g.drawString("k",10,10);
	
}
}
