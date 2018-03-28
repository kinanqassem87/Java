package inheritance.account;

//package Documents and Settings.DR MARIAM.Desktop.cources.java605311.exmple.inheritance;
import javax.swing.*;


public class BankAccount extends Object
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