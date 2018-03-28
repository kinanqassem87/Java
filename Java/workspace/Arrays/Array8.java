import javax.swing.*;
public class Array8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextArea outArea=new JTextArea();
		String number,temp1,nameOfStudent="name\tresult\n-------\t--------\n",result="the grade after organaization is\n",grade,name_s;
		int n,temp;
		number=JOptionPane.showInputDialog(null,"inter number of student");
		n=Integer.parseInt(number);
		String name[]=new String[n];
		int value[]=new int[n];
		for(int i=0;i<value.length;i++){
			name_s=JOptionPane.showInputDialog(null,"inter the name of student");
			name[i]=name_s;
			nameOfStudent+=name[i]+"\t";
			grade=JOptionPane.showInputDialog(null,"inter his grade");
			value[i]=Integer.parseInt(grade);
			nameOfStudent+=value[i]+"\n";
		}
		nameOfStudent+="\n"+result+"\n";
		for(int k=1;k<n;k++){
			for(int j=0;j<n-1;j++){
				
				if(value[j]<value[j+1]){
					temp=value[j];
					temp1=name[j];
					value[j]=value[j+1];
					name[j]=name[j+1];
					value[j+1]=temp;
					name[j+1]=temp1;
					
					
					 
				}
			}
		}
		for(int i=0;i<n;i++){
			nameOfStudent+=name[i]+"\t"+value[i]+"\n";
		}
		outArea.setText(nameOfStudent);
		JOptionPane.showMessageDialog(null,outArea);
	}

}
