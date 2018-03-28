import javax.swing.*;
public class TestSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=0;i<=10;i++){
			sum+=i;
		}
		JOptionPane.showMessageDialog(null,"the sum"+sum);
	}

}
