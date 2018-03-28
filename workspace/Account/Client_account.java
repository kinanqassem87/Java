
import java.util.Date;
 import javax.swing.JOptionPane;
 class Account{
 private int account_no;
 private String customer_name;
 private double balance;
 Date last_Transaction_Date;
 Account(int no ,String name ){
 account_no=no;
 customer_name=name;
 }
 Account(int no ,String name ,double amt ){
 account_no=no;
 customer_name=name;
 balance=amt;
 }
 void deposit (double amt) {
 if (amt>0 ){
 balance += amt;
 last_Transaction_Date= new Date();
 }
 else
 JOptionPane.showMessageDialog(null,"the deposit amount must be > 0");
 }
 void withdraw(double amt){
	 if (amt<=balance ){
		  balance-=amt;
		  last_Transaction_Date= new Date();
		  }
		  else
		  JOptionPane.showMessageDialog(null,"the withdraw amount must be <= balance");
		  }
		  public double getBalance(){
		  return balance;
		  }
		  public String getCustomer(){
		  return customer_name;
		  }
		 /* public int getaccount_no(){
			return account_no;  
		  }*/
		  }


public class Client_account {

	public static void main(String args[]){
		 Account acc1=new Account(12, "Ali");
		 Account acc2=new Account(12, "Fahad", 7350.3);
		 acc1.deposit(2000);
		 acc2.withdraw(200);
		 System.out.println("\n Name: "+acc1.getCustomer());
		 System.out.println("\tHis Balance= " + acc1.getBalance());
		 System.out.println("\tThe date of the last transaction is: " + acc1.last_Transaction_Date);
		 System.out.println(" Name: "+acc2.getCustomer());
		 System.out.println("\tHis Balance= " + acc2.getBalance());
		  System.out.println("\tThe date of the last transaction is: " + acc2.last_Transaction_Date);
		  System.out.println();
		  }
	}
	

