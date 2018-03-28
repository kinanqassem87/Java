import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberButtons extends JFrame {
   private JTextField numberText;
   private JButton oneButton, twoButton, threeButton, exitButton;

   // set up GUI
   public NumberButtons(String title )
   {
      super( title );

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // construct textfield
      numberText = new JTextField( "",10 );
      // Creat textField1 with 10 character
      container.add( numberText );

      // construct oneButton
      oneButton = new JButton( "1" );
      container.add( oneButton );

      // construct twoButton
      twoButton = new JButton( "2" );
      container.add( twoButton );

      // construct threeButton
      threeButton = new JButton( "3" );
      container.add( threeButton );

      // construct exitButton
	  exitButton = new JButton( "Exit" );
      container.add( exitButton );


      // register event handlers
      ButtonHandler handler = new ButtonHandler();
      oneButton.addActionListener( handler );
      twoButton.addActionListener( handler );
      threeButton.addActionListener( handler );
      exitButton.addActionListener( handler );

      setSize( 325, 100 );
      setVisible( true );

   } // end constructor TextFieldTest

   public static void main( String args[] )
   {
      NumberButtons application = new NumberButtons("Test Number Buttons");
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // private inner class for event handling
   private class ButtonHandler implements ActionListener {

      // process Button events
      public void actionPerformed( ActionEvent event )
      {
         // user pressed oneButton
         if ( event.getSource() == oneButton )
            numberText.setText("one");

         // user pressed twoButton
		 else if ( event.getSource() == twoButton )
            numberText.setText("two");

        // user pressed threeButton
		 else if ( event.getSource() == threeButton )
            numberText.setText("three");
        // user pressed exitButton
        else if ( event.getSource() == exitButton )
		    System.exit(0);

      } // end method actionPerformed

   } // end private inner class TextFieldHandler

} // end class TextFieldTest