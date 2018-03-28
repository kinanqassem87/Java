//The Java Abstract Windowing Toolkit
import java.awt.*;

public class TextAreaComments extends java.applet.Applet {
//Create a text area named comments with the text:
//This is on line 1
//This is on line 2
//And make it 3 characters tall and 20 characters wide
	TextArea comments = new TextArea("This is on line 1\nThis is on line 2", 3,20);

	public void init() {
//Add it to the screen
		add(comments);
	}
}