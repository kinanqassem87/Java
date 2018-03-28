import javax.swing.*;
public class ContinueLabelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output="";
		nextrow:
			for(int i=1;i<=5;i++){
				output+="\n";
				for(int j=1;j<=10;j++){
					if(j>i)
						continue nextrow;
					output+="  *  ";
				}
			}
		JOptionPane.showMessageDialog(null,output);
	}

}
