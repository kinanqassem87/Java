import java.applet.*;
import java.awt.*;

public class DrawingStuff1 extends Applet {

   int width, height;

   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );
   }

   public void paint( Graphics g ) {

      // As we learned in the last lesson,
      // the origin (0,0) is at the upper left corner.
      // x increases to the right, and y increases downward.

      g.setColor( Color.white );
      g.drawRect( 10, 20, 100, 15 );
      g.setColor( Color.green );
      g.fillRect( 240, 160, 40, 110 );

      g.setColor( Color.blue );
      g.drawOval( 50, 225, 100, 50 );
      g.setColor( Color.orange );
      g.fillOval( 225, 37, 50, 25 );

      g.setColor( Color.yellow );
      g.drawArc( 10, 110, 80, 80, 90, 180 );
      g.setColor( Color.cyan );
      g.fillArc( 140, 40, 120, 120, 90, 45 );

      g.setColor( Color.magenta );
      g.fillArc( 150, 150, 100, 100, 90, 90 );
      g.setColor( Color.white );
      g.fillArc( 160, 160, 80, 80, 90, 90 );

      g.setColor( Color.green );
      g.drawString( "Groovy!", 50, 150 );
      g.drawRoundRect(10,30,50,70,90,45);
      //draw Polygon
      int[] XArray = {20, 160, 120, 160, 20, 60};
      int[] YArray = {20, 20, 90, 160, 160, 90};
      g.drawPolygon (XArray, YArray, 6);
      
      
   }
}
