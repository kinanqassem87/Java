import javax.swing.*;

public class FirstFrame extends JFrame
{
   public FirstFrame()
	{ setTitle("MY FIRST FRAME");
	setSize(300,200);
	//setVisible(true);
	}
   public static void main (String are[])
	{
	JFrame frame = new FirstFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}