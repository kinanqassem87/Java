import java.applet.Applet;
import java.awt.*;

public class View extends Applet {

  public void paint (Graphics g) {
    int Cursor;
    int[] XArray = {20, 160, 120, 160, 20, 60};
    int[] YArray = {20, 20, 90, 160, 160, 90};
    g.drawPolygon (XArray, YArray, 6);
    //Shift the polygon to right side with add to every x in Xarray 200 
    Cursor = 0;
    while (Cursor < 6) {
      XArray [Cursor] = XArray [Cursor] + 200;
      Cursor = Cursor + 1;
    }
    g.fillPolygon (XArray, YArray, 6);
  }

}
