//The Java Abstract Windowing Toolkit
//The Java Event Handling Package
import java.awt.*;
import java.awt.event.*;

public class EventButton extends java.applet.Applet implements ActionListener {

//Create a button
Button clearForm = new Button("Clear");

	public void init() {
//Set it up to generate events
		clearForm.addActionListener(this);
		add(clearForm);
	}

	public void actionPerformed(ActionEvent evt) {
//We need this here because we implemented the action listener
	}

}