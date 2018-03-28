//The Java Abstract Windowing Toolkit
import java.awt.*;

public class ManyButtons extends java.applet.Applet {
//Create the layout manager and set it to leave 10 pixels
//horizontal and 15 pixels of vertical space between all components
	BorderLayout myLayout = new BorderLayout(10,15);
//Create a few buttons
	Button btnHey = new Button("Hey");
	Button btnHow = new Button("how");
	Button btnAre = new Button("are");
	Button btnYou = new Button("you");
	Button btnQuestion = new Button("?");

	public void init() {
//Set the layout
		setLayout(myLayout);
//And add the buttons to the screen
		add(btnHey, "North");
		add(btnHow, "West");
		add(btnAre, "Center");
		add(btnYou, "East");
		add(btnQuestion, "South");
	}
}