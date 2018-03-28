import java.awt.*;
import javax.swing.*;

public class LabelTest1 extends JFrame {
   public LabelTest1()
   {
      setTitle( "Testing JLabel" );
	  JLabel helloLabel= new JLabel("HELLO");
	  helloLabel.setFont(new Font("Monospaced" , Font.ITALIC+Font.BOLD,24));


     // get content pane and set its layout
      Container c = getContentPane();
      c.add( helloLabel );

      setSize( 300, 200 );
      setVisible( true );

   } // end constructor

   public static void main( String args[] )
   {
      LabelTest1 t = new LabelTest1();
      t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // end class LabelTest

