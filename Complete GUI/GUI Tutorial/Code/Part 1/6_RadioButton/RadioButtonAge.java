//The Java Abstract Windowing Toolkit
import java.awt.*;

public class RadioButtonAge extends java.applet.Applet {
//Create a checkbox group named age (these hold other
//Checkboxes making them radio buttons or option boxes
	CheckboxGroup age = new CheckboxGroup();
//Create 4 checkboxes in the age group, the third one's
//Starting value is true
	Checkbox chkUnder10 = new Checkbox("Under 10 years old", false, age);
	Checkbox chk10to15 = new Checkbox("10 to 14 years old", false, age);
	Checkbox chk15to20 = new Checkbox("15 to 19 years old", true, age);
	Checkbox chkOver20 = new Checkbox("Over 20 years old", false, age);


	public void init() {
//Add them all to the screen
		add(chkUnder10);
		add(chk10to15);
		add(chk15to20);
		add(chkOver20);
	}
}