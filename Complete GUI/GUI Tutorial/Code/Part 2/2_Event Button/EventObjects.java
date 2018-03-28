//The Java Abstract Windowing Toolkit
//The Java Event Handling Package
import java.awt.*;
import java.awt.event.*;

public class EventObjects extends java.applet.Applet implements ActionListener {

//Create a button and two text fields
Button fred = new Button("Fred");
TextField Texty = new TextField();
TextField James = new TextField();

	public void init() {
//Let them all generate events
		fred.addActionListener(this);
		Texty.addActionListener(this);
		James.addActionListener(this);
//Add them all to the screen
		add(fred);
		add(Texty);
		add(James);
	}

	public void actionPerformed(ActionEvent evt) {
//Get the source
	Object source = evt.getSource();
//Compare it to all the objects
		if (source == fred) {
			//Fred (the button) caused the event
		}
		else if (source == Texty) {
			//Texty (the text field) caused the event
		}
		else if (source == James) {
			//James (the other text field) cause the event
		}
	}

}