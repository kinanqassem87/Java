//The Java Abstract Windowing Toolkit
import java.awt.*;

public class DropDownListFont extends java.applet.Applet {
//Create a drop down list named textAlignment
	Choice textAlignment = new Choice();

	public void init() {
//Add 4 different options to it:
		textAlignment.add("Left");
		textAlignment.add("Center");
		textAlignment.add("Right");
		textAlignment.add("Random");
//Then add the drop down list to the screen
		add(textAlignment);
	}
}