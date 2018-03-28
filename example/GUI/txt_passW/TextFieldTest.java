import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldTest extends JFrame {
   private JTextField textField1, textField2, textField3;
   private JPasswordField passwordField;

   // set up GUI
   public TextFieldTest()
   {
      super( "Testing JTextField and JPasswordField" );

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // construct textfield with default sizing
      textField1 = new JTextField( 10 );
      // Creat textField1 with 10 character
      container.add( textField1 );

      // construct textfield with default text
      textField2 = new JTextField( "Enter text here" );
      // reat textField2 with the initial value Enter text here
      container.add( textField2 );

      // construct textfield with default text,
      // 20 visible elements and no event handler
      textField3 = new JTextField( "Uneditable text field" );
      textField3.setEditable( false );
      // setEditable method is from JTextCmponent which is the super class of JTextField
      // setEditable method whith parameter false make the text an editable
      container.add( textField3 );

      // construct passwordfield with default text
      passwordField = new JPasswordField( "Hidden text" );
      container.add( passwordField );

      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener( handler );
      /* addActionListener method from class TextField used to register the event of
      each component. it recive an ActionListener object as its argument
      handeler refers to an ActionListener object, because its class TextFieldHandler
      implements ActionListener. after the statement execut, the object to which handeler
      refers listen for event */
      textField2.addActionListener( handler );
      textField3.addActionListener( handler );
      passwordField.addActionListener( handler );

      setSize( 325, 100 );
      setVisible( true );

   } // end constructor TextFieldTest

   public static void main( String args[] )
   {
      TextFieldTest application = new TextFieldTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener {

      // process textfield events
      public void actionPerformed( ActionEvent event )
      {
         String string = "";

         // user pressed Enter in JTextField textField1
         if ( event.getSource() == textField1 )
            string = "textField1: " + event.getActionCommand();
     /* getActionCommand is an ActionEvent method return the text in the JtextField
     that generat the event*/

         // user pressed Enter in JTextField textField2
         else if ( event.getSource() == textField2 )
            string = "textField2: " + event.getActionCommand();

         // user pressed Enter in JTextField textField3
         else if ( event.getSource() == textField3 )
            string = "textField3: " + event.getActionCommand();

         // user pressed Enter in JTextField passwordField
         else if ( event.getSource() == passwordField ) {
            string = "passwordField: " +
               new String( passwordField.getPassword() );
          /* getPasswor is a JPasswordFeild method obtain the password and creat string to display*/

         }

         JOptionPane.showMessageDialog( null, string );

      } // end method actionPerformed

   } // end private inner class TextFieldHandler

} // end class TextFieldTest