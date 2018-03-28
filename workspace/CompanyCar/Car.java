import javax.swing.*;

public  class Car {

private String Name;
private int Number;
private String Type;
//Officer o1;
//Agent a1;
public Car(Officer o1,Agent a1,String Name,int Number,String Type){
	//this.o1 =o1;
	//this.a1 =a1;
	this.Name =Name;
	this.Number =Number;
	this.Type =Type;
	
}

public String getName(){
	return Name;
}
public int getNumber(){
	return Number;
}
public String getType(){
 return Type;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
// TODO Auto-generated method stub
Officer o1=new Officer("kinan","qassem",10000);
Agent a1=new Agent("Abd_Alkader",33333,"LongStreet");		
AgentN a2=new AgentN("New","Haisam",654,"fghj");
Car c1=new Car(o1,a1,"benz",320,"mercedes");
a2.IFADD() ;
a2.isnew() ;
o1.IFID( );
a1.IFADD() ;
JOptionPane.showMessageDialog(null,"Officer information :\n"+o1.getFirstName()+
		"\n"+o1.getIDNumber() +"\n"+o1.getLastName() +
		"\n" +"\nAgent information:\n"+a2.getAdd()   +
		"\n"+a2.getlongname() +"\n+"+a2.gettel() +
		"\n"+a2.isnew() +"\nCar information:\n"+c1.Name +"\n"+
		c1.Number +"\n"+c1.Type +"\n" );

	}

}
