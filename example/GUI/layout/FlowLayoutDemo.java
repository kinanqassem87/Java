
import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo  {

   public static void main( String args[] )
   {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      panel.add(new JButton("one"));
      panel.add(new JButton("two"));
      panel.add(new JButton("three"));
      panel.add(new JButton("four"));
      panel.add(new JButton("five"));
      frame.getContentPane().add(panel);
      frame.setSize(100,200);
      frame.show();
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   }


} // end class FlowLayoutDemo
