import java.applet.*;
import java.awt.*;
import java.lang.Math;
 
public class ArchimedianSpiral extends Applet {
 
   int width, height;
   int N = 30; // number of points per full rotation
   int W = 5;  // winding number, or number of full rotations
 
   public void init() {

      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );
      setForeground( Color.green );
   }
 
   public void paint( Graphics g ) {

      int x1 = 0, y1 = 0, x2, y2;
      for ( int i = 1; i <= W*N; ++i ) {
         double angle = 2*Math.PI*i/(double)N;
         double radius = i/(double)N * width/2 / (W+1);
         x2 = (int)( radius*Math.cos(angle) );
         y2 = -(int)( radius*Math.sin(angle) );
         g.drawLine( width/2+x1, height/2+y1, width/2+x2, height/2+y2 );
         x1 = x2;
         y1 = y2;
      }
   }
}

