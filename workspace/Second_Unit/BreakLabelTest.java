import javax.swing.*;
public class BreakLabelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output="";
		stop:{
			for(int i=1;i<=10;i++){
				output+="\n";
				for(int j=1;j<=5;j++){
					if(i==5)
						break stop;
					output+="  *  ";
				}
			}
		}
		JOptionPane.showMessageDialog(null,output);
	}

}
