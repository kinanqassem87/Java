import java.awt.*;
import javax.swing.*;

public class OverrdingTest{
	public static void main ( String arg[]){
		Employee e = new Employee("sami",1000);
		Manager m = new Manager("sami",1000,"CIS");
		String output= "";
		output += e.getDetails()+"\n"; // print name + salary
		output += m.getDetails()+"\n"; // print name + department

		e = new Manager("sami",1000,"CIS");
		output+= e.getDetails()+"\n"; // print ???

		JOptionPane.showMessageDialog( null, output,"String comparisons", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 );
	}
}