
public class Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { method1(); } catch (Exception e) {
		System.out.println("General Error!");
		} System.out.println("Finished!");
		}
		public static void method1()/*throws ArithmeticException*/  {
		try {
		System.out.println("Method1 Start");
		String c = "abcde";
		int r1 = Integer.parseInt(c);
		System.out.println("Method1 End");
		
		}
		//finally{}
		catch (ArithmeticException e) {
		
		
			//System.out.print( "in method1");
			System.out.println(e);
		}
		}
		
}


