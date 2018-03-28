// java program to insert a ten integer number and check them
//
import javax.swing.JOptionPane;

public class testswitch
{
 public static void main(String args[])
 {
	int m=Integer.parseInt(JOptionPane.showInputDialog("enetr the count of your number   "));
	JOptionPane.showMessageDialog(null," you have going to enter  "+m+" numbers and the program will test them\n"+
	 " ***  The program will be cancelled if your number =0   *** \n" );
	 String output="";
	 int n,k;
	  stop:{
	   	   for(int i=0;i<m;i++)
	     {
	  n=Integer.parseInt(JOptionPane.showInputDialog("enetr number   "+(i+1)));

  		switch(n)
  		{

			case 0:
			break stop;

			case 1:case 3:case 5:case 7:case 9:
			JOptionPane.showMessageDialog(null,n+"   is odd\n");
			output+=n+"  is odd\n";
			break;

			case 2:case 4:case 6:case 8:case 10:
			JOptionPane.showMessageDialog(null,n+"   is even\n");
			output+=n+"  is even\n";
			break;

			default:
			if(n%2==0)
			{JOptionPane.showMessageDialog(null,n+"   is even and grater than 10\n");
			output+=n+"  is even and grater than 10\n";}
			else
			{JOptionPane.showMessageDialog(null,n+"   is odd and grater than 10\n");
			output+=n+"  is odd and grater than 10\n";}
			break;
	    }//switch


      }//for

    }//stop
    output="your entered numbers are:\n"+output;
    JOptionPane.showMessageDialog(null,output);
    System.exit(0);
   }//main

}//class

