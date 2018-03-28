import java.awt.Graphics;
import javax.swing.*;
public class MyFirstApplet extends JApplet
{double sum;
	public void init()
	{
		//String Firstnum,Secondnum;
		double n1,n2;


		n1= Double.parseDouble(JOptionPane.showInputDialog("inter First Number"));
		n2= Double.parseDouble(JOptionPane.showInputDialog("inte second Number"));
		sum = n1+n2;
}
	public void paint( Graphics g)
	{ super.paint(g);
	g.drawRect(10,10,200,200);
	g.drawString("the summation is "+sum,20,20);
}
}

