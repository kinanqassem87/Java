import java.awt.*;
import javax.swing.*;
public class SwitchTest extends JApplet {
	int choose;
	 public void init(){
		String input;
		input=JOptionPane.showInputDialog(null,"inter 1 to draw line\n inter 2 to draw rect\n inter 3 to draw oval");
		choose=Integer.parseInt(input);
		
	}
	 public void paint(Graphics g){
		 super.paint(g);
		 for(int i=1;i<10;i++){
		 switch(choose){
		 case 1:g.drawLine(10,10,200,10*i);break;
		 case 2:g.drawRect(10*i,10*i,10+2*i,10+2*i);break;
		 case 3:g.drawOval(10,10,10*i,10*i);break;
		 }
		 //JOptionPane.showMessageDialog(null,"no thing to draw");
	 }}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
