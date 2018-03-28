
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nulls extends JFrame {
     // set up GUI
   private Container container;
   private JLabel firstLabel,secondLabel;
   private JTextArea firstText;

   public Nulls(String title)
   {
	   super(title);
	   container = getContentPane();

	   // Set layout manager to null
	   container.setLayout(null);

      //Create a label specifing its location, width and high
      firstLabel=new JLabel("first");
      firstLabel.setBounds(new Rectangle(50,50,70,17));

      //Create a another label using another set of method to specify  location, width and high
      secondLabel=new JLabel("second");
      secondLabel.setLocation(100,100);
      secondLabel.setSize(50,10);

        //Create a text specifing its location, width and high
      firstText= new JTextArea("First text", 3,20);
      firstText.setLocation(150,150);
      firstText.setSize(100,20);

      //add gadgets to window container
      container.add(firstLabel);
      container.add(secondLabel);
      container.add(firstText);

      setSize( 400, 400 );
      setVisible( true );



  }//end constructor


   public static void main( String args[] )
   {
      Nulls n = new Nulls("My null Layout");
      n.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }


}//end class Nulls
