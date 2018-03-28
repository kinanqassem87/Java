import javax.swing.*;
public class Logical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean c1=true,c2=false;
boolean c3=(c1&&c1);
boolean c4=(c2&&c2);
boolean c5=(c1&&c2);
boolean c6=(!c1);
boolean c7=(!c2);
boolean c8=(c1||c1);
boolean c9=(c2||c2);
boolean c10=(c1||c2);
JOptionPane.showMessageDialog(null,"AND result\n"+c3+"\n"+c4+"\n"+c5,"AND",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,"NOT result\n"+c6+"\n"+c7,"NOT",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,"OR result\n"+c8+"\n"+c9+"\n"+c10,"OR",JOptionPane.PLAIN_MESSAGE);
	}

}
