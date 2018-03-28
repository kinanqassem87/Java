import javax.swing.*;
public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int number;
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			
			num=JOptionPane.showInputDialog(null,"Inter the number");
			a[i]=Integer.parseInt(num);
			}
		for(int j=0;j<5;j++){
			if(a[j]>60){
				JOptionPane.showMessageDialog(null,a[j]);
			}
		}
	
		}

}
