//The Java Abstract Windowing Toolkit
//The Java Event Handling Package
import java.awt.*;
import java.awt.event.*;

public class TextFieldChanged extends java.applet.Applet implements TextListener {
//Create two text fields, both 20 characters wide
TextField name = new TextField(20);
TextField age = new TextField(20);

	public void init() {
//Let them generate events
		name.addTextListener(this);
		age.addTextListener(this);
//Add them to the screen
		add(name);
		add(age);
	}
	
	public void textValueChanged(TextEvent txt) {
//Get the object source
		Object source = txt.getSource();
//Check if it was the textfield named name
		if (source == name) {
//If it was, show whatever they typed in the status bar
			showStatus("Name: " + name.getText());
		} 
		else {
//Otherwise it was the age textfield, show whatever they typed in the status bar
			showStatus("Age " + age.getText());
		}
	}
}