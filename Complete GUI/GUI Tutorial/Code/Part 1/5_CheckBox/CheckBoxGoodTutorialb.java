//The Java Abstract Windowing Toolkit
import java.awt.*;

public class CheckBoxGoodTutorialb extends java.applet.Applet {
//Create a checkbox named goodTutorial with the caption:
//Is this a good tutorial? and set the starting value to true
	Checkbox goodTutorial = new Checkbox("Is this a good tutorial?", true);

	public void init() {
//Add it to the screen
		add(goodTutorial);
	}
}