
import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo  {

   public static void main( String args[] )
   {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(new JButton("one"),BorderLayout.NORTH);
      panel.add(new JButton("two"),BorderLayout.SOUTH);
      panel.add(new JButton("three"),BorderLayout.EAST);
      panel.add(new JButton("four"),BorderLayout.WEST);
      panel.add(new JButton("five"),BorderLayout.CENTER);
      frame.getContentPane().add(panel);
      frame.setSize(100,200);
      frame.show();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   }


} // end class BorderLayoutDemo
