import javax.swing.*;
import java.awt.*;
public class Array_App extends JApplet {
	
	int row,cul;
	int a[][];
	public void init()

{	
	
	row=Integer.parseInt(JOptionPane.showInputDialog(null,"inter the number of rows"));
	cul=Integer.parseInt(JOptionPane.showInputDialog(null,"inter the number of culoms"));
	  a=new int [row][cul];
	for(int i=0;i<a.length;i++){
		
		for(int j=0;j<a[i].length;j++){
			a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Row " + i +"   Culom  "+j+"\n inter the numbers row next row"));
			
       //System.out.println(a[0][0]);
		}
		
	}
	
	}
	public void paint(Graphics g)
{
		
		super.paint(g);
	
	for(int i=0;i<row;i++){
		for(int j=0;j<cul;j++){
			g.setColor(Color.black);
			g.drawRect(10+j*50,10+i*50,50,50);
		
			g.drawString(""+a[i][j],35+j*50,35+i*50);
			//System.out.println(a[0][0]);
			
		}
	}
	
}
}
