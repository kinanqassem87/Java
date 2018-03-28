//The Java Abstract Windowing Toolkit
import java.awt.*;

public class SimplePanel extends java.applet.Applet {
//Create a panel named myPanel
	Panel myPanel = new Panel();
//Create two buttons
	Button helloButton = new Button("Hello World!");
	Button goodbyeButton = new Button("Goodbye!");

	public void init() {
//Add the two buttons to the panel
		myPanel.add(helloButton);
		myPanel.add(goodbyeButton);
//And then add the panel to the screen
		add(myPanel);
	}
}