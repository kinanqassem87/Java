//The Java Abstract Windowing Toolkit
//The Java Event Handling Package
import java.awt.*;
import java.awt.event.*;

public class CheckBoxEvents extends java.applet.Applet implements ItemListener {

//Create two check boxes
Checkbox item1 = new Checkbox("Item One's Caption");
Checkbox item2 = new Checkbox("Item Two's Caption");

	public void init() {
//Let them generate events
		item1.addItemListener(this);
		item2.addItemListener(this);
//Add them to the screen
		add(item1);
		add(item2);
	}

	public void itemStateChanged(ItemEvent event) {
//Get the command
		String command = (String) event.getItem();
//Check if it was the first one
		if (command == "Item One's Caption") {
			boolean value = item1.getState();
			if (value == true) {
				//It's selected
//Show a message in the status bar
				showStatus("Item 1 true");
			}
			else {
				//It's not selected)
//Show a message in the status bar
				showStatus("Item 1 false");
			}
		}
		else if (command == "Item Two's Caption") {
			boolean value = item2.getState();
			if (value == true) {
				//It's selected
//Show a message in the status bar
				showStatus("Item 2 true");
			}
			else {
				//It's not selected)
//Show a message in the status bar
				showStatus("Item 2 false");
			}
		}
	}
}