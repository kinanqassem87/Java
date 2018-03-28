import javax.swing.*;
public class Array5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,mark,result="The Student were Passed the Exam\n";
		
		String names[]=new String[5];
		int marks[]=new int[5];
		for(int i=0;i<5;i++){
			name=JOptionPane.showInputDialog(null,"Inter the Student Name");
			names[i]=name;
			mark=JOptionPane.showInputDialog(null,"Inter his Mark");
			marks[i]=Integer.parseInt(mark);
			if(marks[i]>=60)result+=names[i]+"\n";
			
		}
		JOptionPane.showMessageDialog(null,result);
	}

}
