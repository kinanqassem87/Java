
import javax.swing.*;
public class TestDo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int data,sum=0;
		
		do{
			input=JOptionPane.showInputDialog(null,"inter the data");
			data=Integer.parseInt(input);
			sum+=data;
			
		}while(data !=10);
		JOptionPane.showMessageDialog(null,"the data is"+sum,"the data",JOptionPane.INFORMATION_MESSAGE);
	

}}
