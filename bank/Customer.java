package bank;

public class Customer {
	double accountNo;
	String Name;
	 double balance;
	Customer(double accountNo,String Name,double balance){
		this.accountNo=accountNo;
		this.Name=Name;
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "Account No " + accountNo + ", Name=" + Name + ", balance=" + balance;
	}
	 double getaccNo() {
		 return accountNo;
	 }
	 double getbal() {
		 return balance;
	 }
	 void setbal(double balance) {
		 this.balance=balance;
	 }
	

}
