
public class Master extends Credit{
	
	private String address;
	
	
	public Master(String name,String username,String acc,String address){
		setName(name);
		setuserName(username);
		setAccount(acc);
		setBallance(0);
		setAddress(address);
	}
	public boolean isActive() {
		if(getAccount().startsWith("mas")){//Function startsWith() Check Start of String variable 
			return true;
		}else{
			return false;
		}
		
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}

}
