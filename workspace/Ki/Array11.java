import javax.swing.*;
public class Array11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showInputDialog(null,"kinan");
		String output="";
		int sum=0;
		int a[][]={{1,2,3},{4,5,6},{7,8}};
		int b[][]={{9,10},{11,12}};
		for(int i=0;i<a.length;i++){
			output+="\n";
			for(int j=0;j<a[i].length;j++){
				output+=a[i][j]+"     ";
				sum+=a[i][j];
			
				
			}
		}
		output+="\n the sum is  =  "+sum;
		JOptionPane.showMessageDialog(null,output);
		
	}

}
