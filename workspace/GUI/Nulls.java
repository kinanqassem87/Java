import javax.swing.*;

import java.awt.*;
public class Nulls extends JFrame {
private Container container;
private JLabel firstLabel;
private JLabel secondLabel;
private JTextArea textarea;
public Nulls(){
super("nulls");
container=getContentPane();
container.setLayout(null);
setSize( 275, 200 );
setVisible( true );
setLocation(200,200);

firstLabel=new JLabel("first");
firstLabel.setBounds(new Rectangle(50,50,70,17));
container.add(firstLabel);

secondLabel=new JLabel("second");
secondLabel.setLocation(100,100);
secondLabel.setSize(50,10);
container.add(secondLabel);

textarea=new JTextArea("text");
textarea.setLocation(150,150);
secondLabel.setSize(100,20);
container.add(textarea);
}
public static void main(String args[]){
	Nulls application = new Nulls();

	 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
}

}
