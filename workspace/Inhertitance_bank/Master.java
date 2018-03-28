
public class Master extends Creidit {
Master(String f,String l,String a,int b)
{
	super(f,l,a,b);
	}

public boolean isActive() {
	if(getacc_id().startsWith("mas"))
		
	return true;
	else
	return false;
	
}
}
