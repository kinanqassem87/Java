
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest1 extends JFrame {
     // set up GUI
   public ButtonTest1()
   {
      setTitle("Button Test");
      JButton helloButton= new JButton ("Hello");

      // get content pane and set its layout
      Container c = getContentPane();
      c.add( helloButton );

      // create an instance of inner class ButtonHandler to use button handelling
      ButtonHandler handler = new ButtonHandler();
      // registe the handler
      helloButton.addActionListener(handler);

      setSize( 300, 200 );
      setVisible( true );
	}// end ButtonTest constructor


// inner class for button event handling
private class ButtonHandler implements ActionListener{
	// handel button event

	public void actionPerformed(ActionEvent event)
		{JOptionPane.showMessageDialog(null,"your pressed: " +event.getActionCommand());
		    	}
	}// end private inner class


   public static void main( String args[] )
   {
      ButtonTest1 t = new ButtonTest1();
      t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }


} // end class ButtonTest2
