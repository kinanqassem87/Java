import java.applet.*;
import java.awt.*;

public class DrawingLines extends Applet {

   int width, height;

   public void init() {
	   setSize(400,400);//Size Of Applet
	   width = getSize().width;//Point Dwon and Right in the corner
      height = getSize().height;
      setBackground( Color.black );//Color of background
      
   }

   public void paint( Graphics g ) {
      g.setColor( Color.green );//Color of line
      for ( int i = 0; i < 10; ++i ) {
         g.drawLine( width, height, i * width / 10, 0 );//drow line
      }
   }
}

