import javax.swing.*;
public class Array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num,num1,output="";
		int number,odd=0;
		
		num=JOptionPane.showInputDialog(null,"How many numbers you want to store in this Array");
		number=Integer.parseInt(num);
		int b[] = new int[number];
		for(int i=0;i<number;i++){
			num1=JOptionPane.showInputDialog(null,"number #"+i);
			b[i]=Integer.parseInt(num1);
			if(b[i]%2!=0)odd++;
			
		}
		for (int j=0;j<number;j++){
			output+=b[j]+"\n";
			
	}
		output+="there are "+odd+" odd number in this array";
		JOptionPane.showMessageDialog(null,output);
	}

}
