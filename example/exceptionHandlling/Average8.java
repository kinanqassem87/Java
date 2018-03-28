public class Average8{
	public static void main (String arr[]){

		try {
			 printAverage(100,20);
		 	}
		catch(IntegerDivisionByZero idbze){
			idbze.printStackTrace();
			System.out.println("Exception Handeled in main().");
			}
		finally{
				System.out.println("finally in main().");
			}
				System.out.println("Exit main().");
	}//end main
	public static void printAverage(int totalSum, int totalNum) throws IntegerDivisionByZero{
			int average= computeAverage(totalSum,totalNum);
			System.out.println("Average="+totalSum+"/"+totalNum+"="+average);
			System.out.println("Exit printAverage().");

	}//end printAverage
	public static int computeAverage(int sum, int num)throws IntegerDivisionByZero{
		System.out.println("Computing Average().");
		if (num==0)
		throw new IntegerDivisionByZero("Integer division by zero");
		return (sum/num);
	}//end computAverage
}// end class
class IntegerDivisionByZero extends Exception  {
	IntegerDivisionByZero(String str){super(str);}
}