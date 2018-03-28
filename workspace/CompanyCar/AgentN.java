
public class AgentN extends Agent {
	private String State;
	public AgentN(String State,String LongName, int Tel, String Add) {
		
		super(LongName, Tel, Add);
		this.State =State;
		// TODO Auto-generated constructor stub
	}
	public boolean isnew(){
		if(State=="New")
		return true;
		else 
			return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
