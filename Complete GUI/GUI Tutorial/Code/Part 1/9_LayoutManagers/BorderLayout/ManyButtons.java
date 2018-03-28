//The Java Abstract Windowing Toolkit
import java.awt.*;

public class ManyButtons extends java.applet.Applet {
//Create a new layout manager
	BorderLayout myLayout = new BorderLayout();
//Create a few buttons
	Button btnHey = new Button("Hey");
	Button btnHow = new Button("how");
	Button btnAre = new Button("are");
	Button btnYou = new Button("you");
	Button btnQuestion = new Button("?");

	public void init() {
//Set the layout manager to the layout created
		setLayout(myLayout);
//And then add the buttons to different locations
		add(btnHey, "North");
		add(btnHow, "West");
		add(btnAre, "Center");
		add(btnYou, "East");
		add(btnQuestion, "South");
	}
}