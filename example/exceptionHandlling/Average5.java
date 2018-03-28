public class Average5{
	public static void main (String arr[]){
		printAverage(100,0);
		System.out.println("Exit main().");
	}//end main
	public static void printAverage(int totalSum, int totalNum){
		try{
			int average= computeAverage(totalSum,totalNum);
			System.out.println("Average="+totalSum+"/"+totalNum+"="+average);
			}
		finally{
			System.out.println("finally done.");

			}
		System.out.println("Exit printAverage().");
	}//end printAverage
	public static int computeAverage(int sum, int num){
		System.out.println("Computing Average().");
		return (sum/num);
	}//end computAverage
}// end class