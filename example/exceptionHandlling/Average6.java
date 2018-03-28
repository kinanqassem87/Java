public class Average6{
	public static void main (String arr[]){
		System.out.println("Average:"+printAverage(100,20));
		System.out.println("Exit main().");
	}//end main
	public static int printAverage(int totalSum, int totalNum){
			int average=0;
		try{
			average= computeAverage(totalSum,totalNum);
			System.out.println("Average="+totalSum+"/"+totalNum+"="+average);
			return average;
			}
		finally{
			System.out.println("finally done.");
			return average*2;
			}
	}//end printAverage
	public static int computeAverage(int sum, int num){
		System.out.println("Computing Average().");
		return (sum/num);
	}//end computAverage
}// end class