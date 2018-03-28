
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest2 extends JFrame implements ActionListener{
     // set up GUI
   public ButtonTest2()
   {
      setTitle("Button Test");
      JButton helloButton= new JButton ("Hello");

      // get content pane and set its layout
      Container c = getContentPane();
      c.add( helloButton );

      helloButton.addActionListener(this);
      setSize( 300, 200 );
      setVisible( true );
	}// end ButtonTest constructor

      // handle button event
      public void actionPerformed(ActionEvent event)
    	{JOptionPane.showMessageDialog(null,"your pressed: " +event.getActionCommand());
    	}


   public static void main( String args[] )
   {
      ButtonTest2 t = new ButtonTest2();
      t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }


} // end class ButtonTest2
