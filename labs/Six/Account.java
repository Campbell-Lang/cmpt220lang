package cmpt220;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Date dateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}
	
	public double withdraw(int amount) {
		
		return balance -= amount;
	}

	public double deposit(int amount) {
		return balance += amount;
	}

	
}
