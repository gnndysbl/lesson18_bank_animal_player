package by.itacademy.java.lesson18bank;

import java.util.Objects;

public class SavingsAccount extends Account {

	public double interestRate;

	public SavingsAccount(int accountNumber, double balance, String currency, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.currency = currency;
		this.interestRate = interestRate;

	}

	

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(interestRate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return Double.doubleToLongBits(interestRate) == Double.doubleToLongBits(other.interestRate);
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "%" + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", currency=" + currency + "]";
	}

}
