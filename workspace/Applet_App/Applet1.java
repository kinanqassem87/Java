import javax.swing.*;
import java.awt.*;
public class Applet1 extends JApplet {
	public void paint(Graphics g){
		super.paint(g);
		
			for(int j=0;j<5;j++){
				
				
				g.drawLine(100-j*25,50+j*50,150+j*25,50+j*50);
				g.drawLine(0+j*50,250,125+j*25,0+j*50);
				g.drawLine(250-j*50,250,125-j*25,0+j*50);
				
			
		}
	}

}
