import javax.swing.*;
public class Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String result="",firstnum,secondnum;
int num1,num2;
firstnum=JOptionPane.showInputDialog(null,"inter first number");
secondnum=JOptionPane.showInputDialog(null,"inter second number");
num1=Integer.parseInt(firstnum);
num2=Integer.parseInt(secondnum);
if(num1==num2)
	result=result+num1+"=="+num2+"\n";
if(num1>=num2)
	result=result+num1+">="+num2+"\n";
if(num1>num2)
	result=result+num1+">"+num2+"\n";
if(num1<=num2)
	result=result+num1+"<="+num2+"\n";
if(num1<num2)
	result=result+num1+"<"+num2+"\n";
if(num1!=num2)
	result=result+num1+"!="+num2+"\n";
JOptionPane.showMessageDialog(null,result,"Result",JOptionPane.PLAIN_MESSAGE);
	}

}
