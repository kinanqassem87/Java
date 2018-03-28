
public class Visa extends Credit{
	public Visa(String name,String username,String acc){
		setName(name);
		setuserName(username);
		setAccount(acc);
		setBallance(0);
	}

	public boolean isActive() {
		if(getAccount().startsWith("visa")){
			return true;
		}else{
			return false;
		}
		
	}
}
