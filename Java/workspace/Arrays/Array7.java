import javax.swing.*;
public class Array7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number,result="the value is \n",value;
		int num,temp;
		number=JOptionPane.showInputDialog(null,"inter how number you need");
		num=Integer.parseInt(number);
		int a[]=new int[num];
		for(int i=0;i<a.length;i++){
			value=JOptionPane.showInputDialog(null,"inter the num");
			a[i]=Integer.parseInt(value);
			result+=""+a[i]+"  ";
				}
		for(int j=1;j<a.length;j++){
			for(int k=0;k<a.length-1;k++){
				if(a[k]>a[k+1]){
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<a.length;i++){
			result+="\n"+a[i];
		}
		JOptionPane.showMessageDialog(null,result);
	}

}
