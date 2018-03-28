
import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo  {

   public static void main( String args[] )
   {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,2));
      panel.add(new JButton("one"));
      panel.add(new JButton("two"));
      panel.add(new JButton("three"));
      panel.add(new JButton("four"));
      panel.add(new JButton("five"));


      frame.getContentPane().add(panel);
      frame.setSize(300,300);
      frame.show();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   }


} // end class BorderLayoutDemo
