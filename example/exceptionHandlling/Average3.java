public class Average3{
	public static void main (String arr[]){
		 try {
			 printAverage(100,0);
		 	}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Exception Handeled in main().");
			}
		System.out.println("Exit main().");
	}//end main
	public static void printAverage(int totalSum, int totalNum){
		try{
			int average= computeAverage(totalSum,totalNum);
			System.out.println("Average="+totalSum+"/"+totalNum+"="+average);
			}
		//catch(ArithmeticException iae){
		catch(IllegalArgumentException iae){
			iae.printStackTrace();
			System.out.println("Exception Handeled in printAverage().");
			}
		System.out.println("Exit printAverage().");
	}//end printAverage
	public static int computeAverage(int sum, int num){
		System.out.println("Computing Average().");
		return (sum/num);
	}//end computAverage
}// end class