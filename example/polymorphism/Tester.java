public class Tester {

public static void main( String args[]) {
	Person mom = new Person(" Ahmed", "Ali", 71);
	Employee doc = new Employee( "Hasan", "Sami", 45, "Doctor", 275000);
	Person p;
	p = mom;
	System. out. println( p. getName());
	p = doc;
	System. out. println( p. getName());

	}
}