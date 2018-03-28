public class Average7{
	public static void main (String arr[]){

		try {
			 printAverage(100,0);
		 	}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Exception Handeled in main().");
			}
		finally{
				System.out.println("finally in main().");
			}
				System.out.println("Exit main().");
	}//end main
	public static void printAverage(int totalSum, int totalNum){
		try{
			int average= computeAverage(totalSum,totalNum);
			System.out.println("Average="+totalSum+"/"+totalNum+"="+average);
			}
		catch(IllegalArgumentException iae){
			iae.printStackTrace();
			System.out.println("Exception Handeled in printAverage().");
			}
		finally{
			System.out.println("finally printAverage().");
			}
	}//end printAverage
	public static int computeAverage(int sum, int num){
		System.out.println("Computing Average().");
		if (num==0)
		throw new ArithmeticException("Integer division by zero");
		return (sum/num);2
	}//end computAverage
}// end class