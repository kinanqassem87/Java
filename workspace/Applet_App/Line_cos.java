import javax.swing.*;
import java.awt.*;
public class Line_cos extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for (int j=0;j<5;j++){
	
		
		for(int i=0;i<5;i++){
		g.drawLine( 0+i*40,20+j*20,20+i*40,0+j*20);//right
		g.drawLine(20+i*40,0+j*20,40+i*40,20+j*20);//left
	}}
}
}
