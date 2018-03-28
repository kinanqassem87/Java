import javax.swing.*;
import java.awt.*;
public class H_App extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for(int i=0;i<4;i++){
		for(int j=0;j<7;j++){
		if(Math.abs(i-j)<=3&&(i+j)>=3){
			g.setColor(Color.black);
			g.drawRect(100+j*50,100+i*50,50,50);
			
			g.drawString(""+i+","+j,120+j*50,120+i*50);
		}
		}
		
	}
}
}
