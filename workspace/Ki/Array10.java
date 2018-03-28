import javax.swing.*;
public class Array10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number,output="";
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int low=0,high=a.length-1,middle,num,k=0;
		number=JOptionPane.showInputDialog(null,"inter the number");
		num=Integer.parseInt(number);
		while(low<=high){
			middle=(low+high)/2;
			if(num==a[middle]) {k=middle+1;break;}
			else if(num<a[middle]) high=middle-1;
			else low=middle+1;
				
		}
		output+=k;
		JOptionPane.showMessageDialog(null,output);	
	}

}
