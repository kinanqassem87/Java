import java.swing.*;
public clas FindErrors
{
	public static main (String argp[])
	{
		int x = Integer.parseInt(JOptionPane.showInputDialog("enter the value of x");
		String y;
		switch (f1(x))
		{
			case 1: y = JOptionPane.showInputDialog("enter the value of y");
			break;
			case 2: y = JOptionPane.showInputDialog("enter the value of y");
			break;
			case 3: y = JOptionPane.showInputDialog("enter the value of y");
			break;
		}
		for int j= 1 ; j<=1; j++)
		if (f2(y))
		// we must insert a default case in the switch to assur that y have been initialized
		System.out.println("success");
		System.out.println("the value of x="+x+"the value of j="+j);
		// j is out of scope
		JOptionPane.showMessageDialog(null,y.length,"output", JOptionpane.INFORMATION_MESSAGE);
		// length shold be called as method (y.length())
		// second argument must be a string (""+y.length())
	System.exit(0);
}
	public static long f1(int x){return x;}
	// int f1(int x){return x;}

	public static boolean f2(String y){return y[0]='s'? true: false ;}
		// String may not accessed as array ( y.charAt(0))
		// logical operator must be used ( y.charAt(0)=='s')

	public static String f2(boolean y){return y ? true: false ;}
	// String do not accept boolean value (return "true")