// UsingExceptions.java
// Demonstration of stack unwinding.
public class UsingException1 {
public static void main( String args[] )
{
try {
throwException();
}
catch ( Exception e ) {
System.out.println( "Exception handled in main" );
}
}
public static void throwException() throws Exception
{
// Throw an exception and catch it in main.
try {
System.out.println( "Method throwException" );
throw new Exception(); // generate exception
}
catch( RuntimeException e ) { // nothing caught here 
	System.out.println( "Exception handled in " + "method throwException" );
}
finally {
System.out.println( "Finally is always executed" );
}
}
}