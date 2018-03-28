
import javax.swing.*;
public class TestMultable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String table="";
		// TODO Auto-generated method stub
		System.out.println("\t multiplication table \n------------------------------\n");
		//table+="\t multiplication table \n------------------------------\n";
		for(int k=1;k<=9;k++){System.out.print("\t"+k+"  ");
		//table+="\t"+k+"  ";
		}
		
		for(int i=1;i<=9;i++){
			
			System.out.print("\n\n "+i+"|");
			//table+="\n\n "+i+"|";
			for(int j=1;j<=9;j++){
				
				System.out.print("\t"+(i*j)+"  ");
				//table+="\t"+(i*j)+"  ";
			}
			System.out.print("\n");
			//table+="\n";
		}
		JOptionPane.showMessageDialog(null,"done");
	}

}
