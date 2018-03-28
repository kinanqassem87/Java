import java.applet.*;
import java.awt.*;

public class DrawingLines1 extends Applet {

   /**
	 * 
	 */
	
/*int w, h;

   public void init() {
	   
	   w = getSize().width;
      h = getSize().height;
      setBackground( Color.black );
      setSize(400, 400);
     
   }*/

   public void paint( Graphics g ) {
      g.setColor( Color.green );
      for ( int i = 0; i < 10; ++i ) {
         g.drawLine( 100,200 , i * getSize().width / 10, 0 );
      }
   }
}

