import javax.swing.*;
public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num,output="";
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			
			num=JOptionPane.showInputDialog(null,"Inter the number");
			a[i]=Integer.parseInt(num);
			if(a[i]>60){
				output+=a[i]+"\n";
				}
			}
		
		JOptionPane.showMessageDialog(null,output);
		}

}
