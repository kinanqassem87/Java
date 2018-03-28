import javax.swing.*;
public class Officer {
private String First_Name;
private String Last_Name;
private int ID_Number;
public Officer(String First_Name,String Last_name,int ID_Number){
	this.First_Name =First_Name;
	this.Last_Name =Last_name;
	this.ID_Number =ID_Number;
}
public String getFirstName(){
	return First_Name;
}
public String getLastName(){
	return Last_Name;
}
public int getIDNumber(){
	
	return ID_Number;
}
public int IFID(){
	if(ID_Number>10111){
		JOptionPane.showMessageDialog( null,"You Cann't Buy Now\n");
		System.exit( 0);
	}
	return ID_Number;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
