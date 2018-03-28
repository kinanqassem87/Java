import javax.swing.*;
public class Array6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number,number1,result="";
		int num;
		number=JOptionPane.showInputDialog(null,"Inter the number you need");
		num=Integer.parseInt(number);
		int a[]=new int[num];
		//int b[]=new int[num];
		result+="the number at first\n";
		for(int i=0;i<a.length;i++){
			number1=JOptionPane.showInputDialog(null,"inter number");
			a[i]=Integer.parseInt(number1);
			result+=a[i]+"  ";
		}
		result+="\n number after oppisot\n";
		for(int j=a.length-1;j>=0;j--){
			result+=a[j]+"  ";
		}
		JOptionPane.showMessageDialog(null,result);
	}

}
