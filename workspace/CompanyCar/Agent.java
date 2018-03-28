
public class Agent {
protected String LongName;
protected int Tel;
protected String Add;

public Agent(String LongName,int Tel,String Add){
	this.LongName =LongName;
	this.Tel =Tel;
	this.Add =Add;
	
}
public String getlongname(){
	return LongName;
}
public int gettel(){
	return Tel;
}
public String getAdd(){
	
	return Add;
}
public String IFADD(){
	if(Add!="LongStreet"){
		Add="LongStreet";
		}
	return Add;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
