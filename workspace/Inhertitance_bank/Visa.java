
public class Visa extends Creidit {
	Visa(String f,String l,String a,int b)
	{
		super(f,l,a,b);
		}

	public boolean isActive() {
		if(getacc_id().startsWith("vis"))
			
		return true;
		else
		return false;
		
	}
}
