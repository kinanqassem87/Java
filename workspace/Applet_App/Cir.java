import javax.swing.*;
import java.awt.*;
public class Cir extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for (int j=1;j<4;j++){
		for(int i=1;i<6;i++){
		//i%2!=0
			if(Math.abs(i-j)<=2&&(i+j)>=4)
		g.drawOval(10+i*50,10+j*50,50,50);
		
		
	}}
}
}
