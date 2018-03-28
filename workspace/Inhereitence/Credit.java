
public abstract class Credit {
	
	protected String fullName;
	protected String username;
	protected String acc_id;
	protected int balance;
	
	public void setName(String name){
		this.fullName = name;
	}
	public void setuserName(String username){
		this.username = username;
	}
	public void setAccount(String account){
		this.acc_id = account;
	}
	public void setBallance(int bal){
		this.balance= bal;
	}
	
	public String getFullName(){
		return fullName;
	}
	public String getUserName(){
		return username;
	}
	public String getAccount(){
		return acc_id;
	}
	public int getBalance(){
		return balance;
	}
	
	
	public void deposit(int ammount){
		if(isActive()){
			balance+=ammount;
		}
		
	}
	public void withDraw(int ammount){
		if(isActive()){
			if(balance>=ammount){
				balance-=ammount;
			}else{
				System.out.println("you dont have enough money");
			}
		}
		
	}
	abstract boolean isActive();
	

}
