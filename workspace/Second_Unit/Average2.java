import javax.swing.*;
public class Average2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String grad="";
		int num,i=0,sum=0;
		float average=0;
		grad=JOptionPane.showInputDialog(null,"inter the grade and press 0 to quit");
		num=Integer.parseInt(grad);
		while(num!=0){
			sum+=num;
			i++;
			average=sum/i;
			grad=JOptionPane.showInputDialog(null,"inter the grade and press 0 to quit");
			num=Integer.parseInt(grad);
			
		}
		if(i!=0)
		JOptionPane.showMessageDialog(null,"The average is"+average,"The result",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"you didnot inter the grad");
	}

}
