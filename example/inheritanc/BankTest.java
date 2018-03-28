import javax.swing.*;

class BankAccount
{
	double interestRate;
	double balance;
	BankAccount(){balance = 0.0; interestRate= 9.0;}
	public double currentRate(){return interestRate;}
	public void setRate(double newRate){
		if (newRate > 0.0 && newRate < 10.0)
		interestRate = newRate;}
	void deposit ( double ammount){
		if ( ammount > 0.0 )
		balance+= ammount;}
	void withdrawal ( double ammount){
		if ( ammount > 0.0 )
			if ( ammount <= balance )
				balance-= ammount;}
	int getBalance (){
		int total = (int) ( balance * 100 + 0.5);
		return total;}
	void monthly(){
		fee();
		interest();}
	void fee(){balance-= 5.0;}
	void interest(){balance+= balance *(interestRate/1200);}
}
// Banktest.java

public class BankTest
{
	public static void main(String Argv[])
	{
	JTextArea output = new JTextArea();
	output.setText("\tJan\tFeb\tMar\tAbr\tMay\tJun\tJul\tAug\tSep\tOct\tNov\tDec\n");
	double monthlyDeposit;
	double interest;
	monthlyDeposit= Double.parseDouble(JOptionPane.showInputDialog("Enter the Monthly Deposit Pleas"));
	interest = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest value Pleas"));
	BankAccount myAccount= new BankAccount();
	myAccount.setRate(interest);
	for ( int year = 2004 ; year < 2020; year++){
		output.append( year + "\t");
		for ( int month = 1 ; month <=12; month++){
			myAccount.deposit(monthlyDeposit);
			myAccount.monthly();
			output.append(myAccount.getBalance()+"\t");
			}
		output.append("\n");
		}
		JOptionPane.showMessageDialog(null,output,"your Balance",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
