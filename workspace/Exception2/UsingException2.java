// UsingExceptions.java
// Demonstrating the getMessage and printStackTrace
// methods inherited into all exception classes.
public class UsingException2 {
/**
 * @param args
 */
public static void main( String args[] )
{
	
try {
method1();
}
catch ( Exception e ) {

	//System.out.println( e.getMessage() + "\n" );
	System.out.println("kinan");
	e.printStackTrace ();
	System.out.print( e.toString() );

}
}
public static void method1() throws Exception
{

	method2();

}
public static void method2() throws Exception
{
method3();
}
public static void method3() throws Exception
{

	int x=0;
	if(x==0){
		//System.out.println("Qassem");
		throw new Exception( "Exception thrown in method3" );
		
	}
	System.out.print( "Donot entered in Excepion");
}
}