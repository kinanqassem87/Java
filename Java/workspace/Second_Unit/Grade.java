import javax.swing.*;
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number,result="";
int value;

number=JOptionPane.showInputDialog(null,"inter your garde");
value=Integer.parseInt(number);

if(value>100||value<0)
	result="Please Inter value between 100 and zero";

else {
if(value>=90&&value<=100)
	result="Pass and your grad is A\n";
else if(value>=80&&value<90)
	result="Pass and your grad is B\n";
else if(value>=70&&value<80)
	result="Pass and your grad is c\n";
else if(value>=60&&value<70)
	result="Pass and your grad is d\n";
else if(value>=50&&value>=0&&value<60)
	result="Pass and your grad is e\n";
else
	result="failed\n";

}
JOptionPane.showMessageDialog(null,result,"Result",JOptionPane.PLAIN_MESSAGE);

	}

}
