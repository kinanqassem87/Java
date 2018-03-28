//The Java Abstract Windowing Toolkit
import java.awt.*;

public class TextFieldSetEditable extends java.applet.Applet {
//Create two text fields both 20 characters long
TextField fred = new TextField(20);
TextField Texty = new TextField(20);

	public void init() {
//Set fred to be non-editable
	fred.setEditable(false);
//Let Texty be editable (by default it is, 
//but just as a demonstration of how to do it)
	Texty.setEditable(true);
//Add them both to the screen
	add(fred);
	add(Texty);
	}
}