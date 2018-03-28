//The Java Abstract Windowing Toolkit
import java.awt.*;

public class EmailLabel extends java.applet.Applet {
//Create a label named eMailLable with the caption E-mail address: 
	Label eMailLabel = new Label("E-mail address: ");

	public void init() {
//Add the label to the screen
		add(eMailLabel);
	}
}