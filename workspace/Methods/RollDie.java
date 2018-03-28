import javax.swing.*;
public class RollDie {
//??? ??? ??? ??? ????  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes="";
		int num;
		for(int i=1;i<=5;i++){
		num= 1+(int)(Math.random()*6);
		mes+="the face in try "+i+"  is "+num+"\n";
		
		}
		
		JOptionPane.showMessageDialog(null,mes);
	}

}
