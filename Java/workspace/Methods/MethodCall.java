import javax.swing.*;
public class MethodCall {
	static void sum1(int x,int y){
		int z=0;
		z=x+y;
		
		JOptionPane.showMessageDialog(null,z);
	}
	static int sum2(int x,int y){
		int z=0;
		z=x+y;
		return z;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,y=4,a=0;
		sum1(x,y);
		sum1(10,3);
		a=3+sum2(x,y);
		JOptionPane.showMessageDialog(null,a);
		
	}
	

}
