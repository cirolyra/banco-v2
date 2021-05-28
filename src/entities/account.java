package entities;

public class account {

	private int number;
	private String holder;
	private double balance;

	public account(int number, String holder) {

		this.number = number;
		this.holder = holder;

	}

	public account(int number, String holder, double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account "
				+getNumber()
				+", Holder: "
				+getHolder()
				+", Balance: R$ "
				+String.format("%.2f", getBalance());
	}
	
}
