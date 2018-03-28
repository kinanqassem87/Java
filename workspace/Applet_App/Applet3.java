import javax.swing.*;
import java.awt.*;
public class Applet3 extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
			if((i+j)%2==0&&(i<=j)){
				g.drawOval(10+j*50,10+i*50,50,50);
			}
		}
	}
}
}

