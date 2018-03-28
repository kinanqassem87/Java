import javax.swing.*;
public class Month {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String month,name="";
int mon;
month=JOptionPane.showInputDialog(null,"Inter number of month");
mon=Integer.parseInt(month);
switch(mon){
case 1:name="JAN";break;
case 2:name="FEB";break;
case 3:name="MAR";break;
case 4:name="APR";break;
case 5:name="MAY";break;
case 6:name="JUN";break;
case 7:name="JULY";break;
case 8:name="AGS";break;
case 9:name="SEP";break;
case 10:name="OCT";break;
case 11:name="NOV";break;
case 12:name="DEC";break;
}
//name="not found";
JOptionPane.showMessageDialog(null,"The Month is "+name,"Month Name",JOptionPane.INFORMATION_MESSAGE);
	}

}
