//The Java Abstract Windowing Toolkit
import java.awt.*;

public class CheckBoxGoodTutorial extends java.applet.Applet {
//Create a checkbox named goodTutorial with the caption Is this a good tutorial?
	Checkbox goodTutorial = new Checkbox("Is this a good tutorial?");

	public void init() {
//Add it to the screen
		add(goodTutorial);
	}
}