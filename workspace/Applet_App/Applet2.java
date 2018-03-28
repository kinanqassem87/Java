import javax.swing.*;
import java.awt.*;
public class Applet2 extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for(int j=1;j<=6;j++){
		for(int i=1;i<=9;i++){
			if((i%2!=0)&&((i+j)>=6)&&(Math.abs(i-j)<=5)){
				g.drawRect(10+i*50,10+j*50,50,50);
			}
		}
	}
}
}
