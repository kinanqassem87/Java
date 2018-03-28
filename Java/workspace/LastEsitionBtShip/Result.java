import java.io.Serializable;

public class Result implements Serializable{
	
	String type;
	int posOnShip;
	boolean pieceEnd;
	
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
	
	public boolean isPieceEnd() {
		return pieceEnd;
	}
	public void setPieceEnd(boolean isPieceEnd) {
		this.pieceEnd = isPieceEnd;
	}
	public String toString() {
		return type + posOnShip;
	}
	
}
