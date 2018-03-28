import javax.swing.*;
public class Average1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int average,sum=0,num,i=1;

String grad;
while(i<=10){
	grad=JOptionPane.showInputDialog(null,"Inter the grad");
	num=Integer.parseInt(grad);
	sum+=num;
	i+=1;
	
}
average=sum/10;
JOptionPane.showMessageDialog(null,"The average is "+average,"the average",JOptionPane.INFORMATION_MESSAGE);
	}

}
