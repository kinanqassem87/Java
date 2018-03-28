 import java.awt.*;
 import javax.swing.*;

 public class LabelTest extends JFrame {
 private JLabel label1, label2, label3;

 // set up GUI
 public LabelTest()
 {
 super( "Testing JLabel" );

 // get content pane and set its layout
 Container container = getContentPane();
 container.setLayout( new FlowLayout() );
 
 // JLabel constructor with a string argument
label1 = new JLabel( "Label with text" );
//label1.setBounds(new java.awt.Rectangle(0,0,20,50));//select the position

 label1.setToolTipText( "This is label1" );//mouse message
 container.add( label1 );

 // JLabel constructor with string, Icon and
 // alignment arguments
 Icon bug = new ImageIcon( "bug1.gif" );//define image 
 label2 = new JLabel( "Label with text and icon",
 bug, SwingConstants.LEFT );//image on left
 label2.setToolTipText( "This is label2" );
 container.add( label2 );

 // JLabel constructor no arguments
 label3 = new JLabel();

 label3.setText( "Label with icon and text at bottom" );
 label3.setIcon( bug );//add image
 label3.setHorizontalTextPosition(SwingConstants.CENTER );//all in center
 label3.setVerticalTextPosition( SwingConstants.BOTTOM );//and bottom
 label3.setToolTipText( "This is label3" );
 container.add( label3 );


 setSize( 400, 200 );//size of window
 setVisible( true );
 }


 // execute application
 public static void main( String args[] )
 {
 LabelTest application = new LabelTest();

 application.setDefaultCloseOperation(
 JFrame.EXIT_ON_CLOSE );
 }

 } // end class LabelTest