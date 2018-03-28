import javax.swing.*;
public class Increment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		int c;
		c=5;
		s+=c;
JOptionPane.showMessageDialog(null,s);
c++;
s+="  "+c;
JOptionPane.showMessageDialog(null,s);
s+="  "+c;
JOptionPane.showMessageDialog(null,s);
s+="\n\n";
c=6;
s+="  "+c;
JOptionPane.showMessageDialog(null,s);
++c;
s+="  "+c;
JOptionPane.showMessageDialog(null,s);
s+="  "+c;
JOptionPane.showMessageDialog(null,s);
	}

}
