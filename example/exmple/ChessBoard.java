//chees board
import javax.swing.JApplet;
import java.awt.Graphics;

public class ChessBoard extends JApplet{
	public void paint(Graphics g)
	{int h=20;
		 for(int r=1;r<9;r++)
		  for(int c=1;c<9;c++)
		   {
			   if((r+c)%2==0)
			    {
				  g.fillRect(c*h,r*h,h,h);
			    }
			   else
			     g.drawRect(c*h,r*h,h,h);
		   }
   }
}