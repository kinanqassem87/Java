//The Java Abstract Windowing Toolkit
import java.awt.*;

public class ManyButtons extends java.applet.Applet {
//Create the grid layout with 3 horizontal squares
//And 2 vertical squares
	GridLayout myLayout = new GridLayout(2, 3);
//Create a few buttons
	Button btnHey = new Button("Hey");
	Button btnHow = new Button("how");
	Button btnAre = new Button("are");
	Button btnYou = new Button("you");
	Button btnQuestion = new Button("?");

	public void init() {
//Set the layout to the one we created
		setLayout(myLayout);
//And add the buttons to the screen
		add(btnHey);
		add(btnHow);
		add(btnAre);
		add(btnYou);
		add(btnQuestion);
	}
}