import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class ButtonTest extends JFrame {
 private JButton plainButton, fancyButton;

 // set up GUI
 public ButtonTest()
 {
 super( "Testing Buttons" );

 // get content pane and set its layout
 Container container = getContentPane();
 container.setLayout( new FlowLayout() );

 // create buttons
 plainButton = new JButton( "Plain Button" );
 container.add( plainButton );

 Icon bug1 = new ImageIcon( "bug1.gif" );
 Icon bug2 = new ImageIcon( "bug2.gif" );
 fancyButton = new JButton( "Fancy Button", bug1 );//defualt image on right
 fancyButton.setRolloverIcon( bug2 );//image2 with mouse
 container.add( fancyButton );

 // create an instance of inner class ButtonHandler
 // to use for button event handling
 ButtonHandler handler = new ButtonHandler();//event for button
 fancyButton.addActionListener( handler );
 plainButton.addActionListener( handler );
setSize( 275, 200 );
 setVisible( true );
 }

 // execute application
 public static void main( String args[] )
 {
 ButtonTest application = new ButtonTest();

 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
 }

 // inner class for button event handling
 private class ButtonHandler implements ActionListener {

 // handle button event
 public void actionPerformed( ActionEvent event )
 {
 JOptionPane.showMessageDialog( null, "You pressed: " + event.getActionCommand() );//give string in element
 }

 } // end private inner class ButtonHandler

 } // end class ButtonTest