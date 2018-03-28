//The Java Abstract Windowing Toolkit
import java.awt.*;

public class SimpleButton extends java.applet.Applet {
//Create a button named helloButton with the caption Hello World!
	Button helloButton = new Button("Hello World!");

	public void init() {
//Add the button to the screen
		add(helloButton);
	}
}