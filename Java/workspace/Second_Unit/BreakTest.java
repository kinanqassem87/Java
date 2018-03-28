import javax.swing.*;
public class BreakTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output="";
		int count=0;
		for( count=0;count<=10;count++){
			
			if(count==5)
				break;
			output+=""+count+"\n";
			
			
		}
		output+="\n break of loop in   "+count;
		JOptionPane.showMessageDialog(null,output);
	}

}
