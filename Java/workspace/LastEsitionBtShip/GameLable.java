import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameLable extends JLabel{
	
	private String currState, type;
	private int xPos, yPos, posOnShip;
	private int direction;
	boolean isMine;

	public static final String NOT_USED = "not used";
	public static final String HITT = "hitted";
	public static final String MISSED = "missed";
	
	public static final int HOR = 0;
	public static final int VIR = 1;
	
	public GameLable(){
		super();
	}
	
	
	public boolean isMine() {
		return isMine;
	}


	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}


	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getPosOnShip() {
		return posOnShip;
	}
	public void setPosOnShip(int posOnShip) {
		this.posOnShip = posOnShip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getXPos() {
		return xPos;
	}
	public void setXPos(int x) {
		this.xPos = x;
	}
	public int getYPos() {
		return yPos;
	}
	public void setYPos(int y) {
		this.yPos = y;
	}

	public String getCurrState() {
		return currState;
	}
	public void setCurrState(String currState) {
		this.currState = currState;
		
	}
	
	public void reDraw() {
		String imagePath = "img/";
		if(type == null) {
			if(currState == null) {
				imagePath += "NOT_USED.png";
			}
			else if(currState.equals(MISSED)){
				imagePath += "MISSED.png";
			}
			else if(currState.equals(HITT)){
				imagePath += "HIT.png";
			}
		} else {
			if(currState == null) {
				imagePath += type + "_" + direction + posOnShip + ".png";
			}
			else if(currState.equals(HITT)){
				imagePath += type + "_" + direction + posOnShip + "H.png";
			}
		}
		System.out.println(imagePath);
		this.setIcon(new ImageIcon(imagePath));
		this.repaint();
	}
}
