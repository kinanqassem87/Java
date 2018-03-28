import javax.swing.*;;
public class Array9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		String number,output = "";
		int num,k;
		for(int i=0;i<a.length;i++){
			a[i]=i+1;
		}
		number=JOptionPane.showInputDialog(null,"inter the number for searching");
		num=Integer.parseInt(number);
		for(int j=0;j<a.length;j++){
			if(num==a[j]) {
				k=j+1;
				output="the number in "+k+"   index";}
			
		}
		JOptionPane.showMessageDialog(null,output);
	}

}
