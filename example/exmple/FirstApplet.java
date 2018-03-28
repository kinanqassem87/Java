// Welcome3.java
// Printing multiple lines in a dialog box.

// Java packages
import javax.swing.JApplet;// program uses JOptionPane
import java.awt.Graphics;

public class FirstApplet extends JApplet{

   // main method begins execution of Java application
   public void paint ( Graphics g )
   {
   super.paint(g);
   g.drawString("Welcome to java Applet",20,30);

   } // end method main

} // end class Welcome3