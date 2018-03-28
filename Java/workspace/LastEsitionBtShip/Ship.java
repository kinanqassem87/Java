
public class Ship {
	
	public static final String TYPE_AIRCRATTCARRIER = "AC";
	public static final String TYPE_BATTLESHIP = "BS";
	public static final String TYPE_FRIGATE = "FR";
	public static final String TYPE_SUBMARINE = "SM";
	public static final String TYPE_MINESWEEPER = "MS";
	
	public static final int DIRECTION_UP = 1;
	public static final int DIRECTION_DOWN = 2;
	public static final int DIRECTION_RIGHT = 3;
	public static final int DIRECTION_LEFT = 4;
	
	public static final int LENGTH_AIRCRATTCARRIER = 5;
	public static final int LENGTH_BATTLESHIP = 4;
	public static final int LENGTH_FRIGATE = 3;
	public static final int LENGTH_SUBMARINE = 3;
	public static final int LENGTH_MINESWEEPER = 2;
	
	private String type;
	private int length, xStart, yStart, direction;
	private int status;
	
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getXStart() {
		return xStart;
	}
	public void setXStart(int start) {
		xStart = start;
	}
	public int getYStart() {
		return yStart;
	}
	public void setYStart(int start) {
		yStart = start;
	}
	public boolean canTurnUp() {
		System.out.println(xStart + "," + yStart + "," + length);
		System.out.println("yStart >= length");
		return yStart >= length;
	}
	public boolean canTurnRight() {
		System.out.println(xStart + "," + yStart + "," + length);
		System.out.println("xStart + length - 1 <= 10");
		return xStart + length - 1 <= 10;
	}
	public boolean canTurnLeft() {
		System.out.println(xStart + "," + yStart + "," + length);
		System.out.println("xStart >= length");
		return xStart >= length;
	}
	public boolean canTurnDown() {
		System.out.println(xStart + "," + yStart + "," + length);
		System.out.println("yStart + length - 1 <= 10");
		return yStart + length - 1 <= 10;
		
	}
}
