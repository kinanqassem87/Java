import javax.swing.*;
public class ContinueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output="";
		for(int count=0;count<=10;count++){
			if(count==5)
				continue;
			output+="   "+count;
		}
		output+="\t      \n continue when arrive at 5";
		JOptionPane.showMessageDialog(null,output);
	}

}
