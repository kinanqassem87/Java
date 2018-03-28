import java.awt.*; 
import java.applet.*;
public class DrowString extends Applet {
public void paint(Graphics g){
	super.paint(g );
	g.getFont();
	//g.setFont(Font.BOLD);
	g.drawString( "Welcome to Applet",50,100);//Draw String
}
}
