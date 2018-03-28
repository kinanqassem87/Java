import javax.swing.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s,output="";
		System.out.println("Hello to the world");
s=JOptionPane.showInputDialog(null,"inter number");
int x=Integer.parseInt(s);
output+=x;
JOptionPane.showMessageDialog(null,output);
	}

}
