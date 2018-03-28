
public abstract class Creidit {
protected String fullName;
protected String lastName;
protected String acc_id;
protected  int balance;
 Creidit(String f,String l,String a,int b)
{
this.fullName=f;
this.lastName=l;
this.acc_id=a;
this.balance=b;
	
}
public String getfullName(){
	return fullName;
}
public String getlastName(){
	return lastName;
}
public String getacc_id(){
	return acc_id;
}
public int getbalance(){
	return balance;
}

public int withdraw(int b)
{
	if(isActive()){
	if(balance>b)
		balance-=b;}
	return balance;
	}
public int deposet(int b)
{
	if(isActive()){
	
		balance+=b;}
	return balance;
	}
public abstract boolean isActive();
}
