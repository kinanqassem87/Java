import javax.swing.*;
import java.awt.*;
public class line_str extends JApplet {
public void paint(Graphics g){
	super.paint(g);
	for (int j=0;j<5;j++){
		
	for(int i=0;i<5;i++){
		if(i<=j)
		g.drawRect(10+i*50,10+j*50,50,50);
		
	}}
}
}
