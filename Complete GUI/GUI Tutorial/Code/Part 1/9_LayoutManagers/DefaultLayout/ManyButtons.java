//The Java Abstract Windowing Toolkit
import java.awt.*;

public class ManyButtons extends java.applet.Applet {
//Since this uses the default layout manager, we don't need to do anything
//Other than create a few butons
	Button btnHey = new Button("Hey");
	Button btnHow = new Button("how");
	Button btnAre = new Button("are");
	Button btnYou = new Button("you");
	Button btnQuestion = new Button("?");

	public void init() {
//And add them to the screen
		add(btnHey);
		add(btnHow);
		add(btnAre);
		add(btnYou);
		add(btnQuestion);
	}
}