import javax.swing.*;
public class Sumation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String first_number,second_number;
int num1,num2,sum;
first_number=JOptionPane.showInputDialog(null,"inter first number");
second_number=JOptionPane.showInputDialog(null,"inter second number");
num1=Integer.parseInt(first_number);
num2=Integer.parseInt(second_number);
sum=num1+num2;
JOptionPane.showMessageDialog(null,"The sum is  "+sum,"Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
