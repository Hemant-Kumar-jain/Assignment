package interface_ex;

interface BankAccount{
	void withdraw();
	void deposit();
}

public class CheckingAccount implements BankAccount {
	public void withdraw() {
		System.out.println("This is Withdraw Method");
	}
	
	public void deposit() {
		System.out.println("This is Deposit Method");
	}
	
	public static void main(String[] args) {
		CheckingAccount ca=new CheckingAccount();
		ca.withdraw();
		ca.deposit();
	}
}
