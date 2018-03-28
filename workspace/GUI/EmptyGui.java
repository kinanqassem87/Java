import java.awt.*;
import javax.swing.*;

 public class EmptyGui extends JFrame {
  // set up GUI
 public EmptyGui()
 {
 super( "Test" );
// get content pane and set its layout
 Container container = getContentPane();
 container.setLayout( new FlowLayout() );

 setSize( 275, 200 );
 setVisible( true );
 setLocation(200,200);
 }

 // execute application
 public static void main( String args[] )
 {
 EmptyGui application = new EmptyGui();

 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
 }
} // end class ButtonTest