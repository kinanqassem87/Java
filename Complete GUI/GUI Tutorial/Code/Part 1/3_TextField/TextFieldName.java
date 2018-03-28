//The Java Abstract Windowing Toolkit
import java.awt.*;

public class TextFieldName extends java.applet.Applet {
//Create a text field named TextFieldName with the 
//text Donny in it and make it big enough to hold 10 characters
	TextField TextFieldName = new TextField("Donny", 10);

	public void init() {
//Add it to the screen
		add(TextFieldName);
	}
}