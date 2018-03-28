import java.awt.*;
import javax.swing.JApplet;
public class Ch extends JApplet {
	public void init(){
		setBackground(Color.BLUE);
		setSize(450,450);
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		
		for (int i=1;i<=4;i++){
			for (int j=1;j<=4;j++){
				g.setColor( Color.black );
			    g.fillRect( 10+i*60,10+j*60 , 30, 30 );
			    
			    
			    g.setColor( Color.blue );
				g.fillRect( 10+i*60,40+j*60 , 30, 30 );
				
				
				g.setColor( Color.black );
			    g.fillRect( 40+i*60,40+j*60 , 30, 30 );
			    
			   
				
				g.setColor( Color.blue );
				 g.fillRect( 40+i*60,10+j*60 , 30, 30 );
			    
			    
			}
			
		}
		
	}
	
}
