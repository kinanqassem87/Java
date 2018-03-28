import javax.swing.*;
public class Array4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number,output="";
		
		int a[]=new int[5];
		for (int i=0;i<5;i++){
			number=JOptionPane.showInputDialog(null,"Inter the number");
			a[i]=Integer.parseInt(number);
			switch(a[i]){
			case 1:output+="one\n";break;
			case 2:output+="two\n";break;
			case 3:output+="three\n";break;
			case 4:output+="four\n";break;
			case 5:output+="five\n";break;
			default:output+="more than 5 and less than 1";break;
			}
			
		}
		JOptionPane.showMessageDialog(null,output);
		
		
		
	}

}
