// Fig. B.1: WelcomeApplet.java
 // A first applet in Java.

 // Java core packages
 import java.awt.Graphics; // import class Graphics

 // Java extension packages
 import javax.swing.JApplet; // import class JApplet

 public class WelcomeApplet extends JApplet {

 // draw text on applet’s background
 public void paint( Graphics g )
 {
 // call inherited version of method paint
 super.paint( g );
for(int i=1;i<=5;i++){
	//line(x1,y1,x2,y2)
	//g.drawLine( 10,10,10,100);
	//rec(x,y,width,high)
	//g.drawRect( 20,10,100,10);
	//oval(xcen,ycen,widthline,highline)
	g.drawOval( 50,50,50,100);
	
}
 // draw a String at x-coordinate 25 and y-coordinate 25
// g.drawString( "Welcome to Java Programming!", 25, 25 );

 } // end method paint

 } // end class WelcomeApplet